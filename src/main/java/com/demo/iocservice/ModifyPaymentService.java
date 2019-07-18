package com.demo.iocservice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("ModifyPaymentServiceV2")
@Service
public class ModifyPaymentService implements IPaymentService {

	@Override
	public String executeOperation() {
		return ("payment modified");
	}

}
