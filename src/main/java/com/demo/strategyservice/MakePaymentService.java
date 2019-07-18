package com.demo.strategyservice;

import com.demo.strategyservice.util.StrategyService;

@StrategyService(type = IPaymentService.class, value = "ADD")
public class MakePaymentService implements IPaymentService {

	@Override
	public String executeOperation() {
		return ("payment created");
	}

}
