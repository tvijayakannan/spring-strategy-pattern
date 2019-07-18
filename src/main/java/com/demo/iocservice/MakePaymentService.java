package com.demo.iocservice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("MakePaymentServiceV2")
@Service
public class MakePaymentService implements IPaymentService {

	@Override
	public String executeOperation() {
		return ("payment created");
	}

}
