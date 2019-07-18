package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.strategyservice.IPaymentService;
import com.demo.strategyservice.util.StrategyFactory;

@RestController
@RequestMapping("/rest/v3/payment")
public class ProcessPaymentControllerV3 {

	@Autowired
	StrategyFactory strategyFactory;

	@RequestMapping("/process/{type}")
	public String singleServiceExecution(@PathVariable("type") String type) {

		return this.strategyFactory.getStrategy(IPaymentService.class, type).executeOperation();

	}

}
