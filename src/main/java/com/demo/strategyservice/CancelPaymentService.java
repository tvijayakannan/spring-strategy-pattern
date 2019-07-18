package com.demo.strategyservice;

import com.demo.strategyservice.util.StrategyService;

@StrategyService(type = IPaymentService.class, value = "CANCEL")
public class CancelPaymentService implements IPaymentService {

	@Override
	public String executeOperation() {
		return ("payment cancelled");
	}

}
