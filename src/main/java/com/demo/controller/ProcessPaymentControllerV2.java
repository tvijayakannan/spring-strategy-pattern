package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.iocservice.IPaymentService;

@RestController
@RequestMapping("/rest/v2/payment")
public class ProcessPaymentControllerV2 {

	@Autowired
	@Qualifier("MakePaymentServiceV2")
	IPaymentService makePaymentService;

	@Autowired
	@Qualifier("ModifyPaymentServiceV2")
	IPaymentService modifyPaymentService;

	@Autowired
	@Qualifier("CancelPaymentServiceV2")
	IPaymentService cancelPaymentService;

	@RequestMapping("/process/{type}")
	public String singleServiceExecution(@PathVariable("type") String type) {

		/*
		 * Code is not modular Changes in one operation might impact others
		 * 
		 */
		String result = "";
		switch (type.toUpperCase()) {
		case "ADD":
			result = makePaymentService.executeOperation();
			break;
		case "MODIFY":
			result = modifyPaymentService.executeOperation();
			break;
		case "CANCEL":
			result = cancelPaymentService.executeOperation();
			break;
		default:
			break;
		}

		return result;
	}

}
