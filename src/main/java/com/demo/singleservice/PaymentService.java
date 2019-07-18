package com.demo.singleservice;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

	public String makePayment() {
		return ("payment created");
	}

	public String modifyPayment() {
		return ("payment modified");
	}

	public String cancelPayment() {
		return ("payment cancelled");
	}
}
