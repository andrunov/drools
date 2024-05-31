package com.javatechie.spring.drools.api;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaOfferController {
	@Autowired
	private KieSession session;

	@PostMapping("/order")
	public Order orderNow(@RequestBody Order order) {
		session.insert(order);
		session.fireAllRules();
		return order;
	}

	@PostMapping("/rate")
	public CreditRequest rateNow(@RequestBody CreditRequest creditRequest) {
		RuleFunctions.INFO.setLength(0);
		session.insert(creditRequest);
		session.fireAllRules();
		creditRequest.setInfo(RuleFunctions.INFO.toString());
		return creditRequest;
	}

}
