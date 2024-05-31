package com.agorbunov.spring.drools.api.controller;

import com.agorbunov.spring.drools.api.logger.RuleLogger;
import com.agorbunov.spring.drools.api.model.CreditRequest;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoolController {
	@Autowired
	private KieSession session;

	@PostMapping("/rate")
	public CreditRequest rateNow(@RequestBody CreditRequest creditRequest) {
		RuleLogger.INFO.setLength(0);
		session.insert(creditRequest);
		session.fireAllRules();
		creditRequest.setInfo(RuleLogger.INFO.toString());
		return creditRequest;
	}

}
