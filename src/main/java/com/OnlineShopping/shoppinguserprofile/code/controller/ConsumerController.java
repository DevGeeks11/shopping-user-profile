package com.OnlineShopping.shoppinguserprofile.code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineShopping.shoppinguserprofile.code.dto.CustomerDTO;
import com.OnlineShopping.shoppinguserprofile.code.service.CustomerService;

@RestController
@RequestMapping("/consumer-service")
public class ConsumerController {

	@Autowired
	private CustomerService custService;
	
	@GetMapping(value="/fetchCustomer", produces = "application/json")
	public List<CustomerDTO> fetchAllTheCustomer(){
		return custService.fetchAllCustomer();
	}
}
