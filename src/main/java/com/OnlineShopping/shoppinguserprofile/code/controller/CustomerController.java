package com.OnlineShopping.shoppinguserprofile.code.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineShopping.shoppinguserprofile.code.common.ServiceResponse;
import com.OnlineShopping.shoppinguserprofile.code.dto.CustomerDTO;
import com.OnlineShopping.shoppinguserprofile.code.service.CustomerService;

@RestController
@RequestMapping("/customer-service")
public class CustomerController{
	
	@Autowired
	private CustomerService custService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, path = "/saveCustomer")
	public ResponseEntity<ServiceResponse> saveCustomer(@RequestBody CustomerDTO customerDTO) {
		ServiceResponse response = new ServiceResponse();
		HttpStatus status = HttpStatus.OK;
		try{
			custService.saveCustomer(customerDTO);
			response.setStatusCode(HttpStatus.CREATED.value());
			status = HttpStatus.CREATED;
		}catch(Exception e) {
			List<Exception> errorList = new ArrayList<Exception>(Arrays.asList(e));
			response.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.setErrorList(errorList);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<ServiceResponse>(response, status);
	}
}