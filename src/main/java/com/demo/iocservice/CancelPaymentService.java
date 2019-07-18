package com.demo.iocservice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("CancelPaymentServiceV2")
@Service
public class CancelPaymentService implements IPaymentService {

	@Override
	public String executeOperation() {
		return ("payment cancelled");
	}

}
