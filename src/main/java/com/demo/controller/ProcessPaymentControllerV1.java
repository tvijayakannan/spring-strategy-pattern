package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.singleservice.PaymentService;

@RestController
@RequestMapping("/rest/v1/payment")
public class ProcessPaymentControllerV1 {

	@Autowired
	PaymentService paymentService;

	@RequestMapping("/process/{type}")
	public String singleServiceExecution(@PathVariable("type") String type) {

		/*
		 * Code is not modular Changes in one operation might impact others
		 * 
		 */
		String result = "";
		switch (type.toUpperCase()) {
		case "ADD":
			result = paymentService.makePayment();
			break;
		case "MODIFY":
			result = paymentService.modifyPayment();
			break;
		case "CANCEL":
			result = paymentService.cancelPayment();
			break;
		default:
			break;
		}

		return result;
	}

}
