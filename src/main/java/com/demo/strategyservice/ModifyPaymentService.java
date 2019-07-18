package com.demo.strategyservice;

import com.demo.strategyservice.util.StrategyService;

@StrategyService(type = IPaymentService.class, value = "MODIFY")
public class ModifyPaymentService implements IPaymentService {

	@Override
	public String executeOperation() {
		return ("payment modified");
	}

}
