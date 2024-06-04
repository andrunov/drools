package com.agorbunov.spring.drools.api.controller;

import com.agorbunov.spring.drools.api.logger.RuleLogger;
import com.agorbunov.spring.drools.api.model.CreditProgram;
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
		session.insert(reester.getCreditRequest());
		session.insert(reester.getCreditProgram());
		session.fireAllRules();
		reester.setInfo(RuleLogger.INFO.toString());
		return reester;
	}

}
