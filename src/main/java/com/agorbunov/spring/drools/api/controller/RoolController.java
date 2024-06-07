package com.agorbunov.spring.drools.api.controller;

import com.agorbunov.spring.drools.api.functions.RateAccount;
import com.agorbunov.spring.drools.api.logger.RuleLogger;
import com.agorbunov.spring.drools.api.model.CreditProgram;
import com.agorbunov.spring.drools.api.model.CreditRequest;
import com.agorbunov.spring.drools.api.model.Reester;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoolController {
	@Autowired
	private KieSession session;

	@PostMapping("/creditRequest")
	public Reester rateNow(@RequestBody Reester reester) {
		RuleLogger.INFO.setLength(0);
		RateAccount.RATE = 0.0;
		CreditRequest creditRequest = reester.getCreditRequest();
		session.insert(creditRequest);
		CreditProgram creditProgram = new CreditProgram();
		creditProgram.setProgramCode(creditRequest.getProgramCode());
		creditProgram.setDate(creditRequest.getApplicDate());
		session.insert(creditProgram);
		session.fireAllRules();
		creditProgram.setRate(RateAccount.RATE);
		reester.setCreditProgram(creditProgram);
		reester.setInfo(RuleLogger.INFO.toString());
		return reester;
	}

}
