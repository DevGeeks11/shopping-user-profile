package com.OnlineShopping.shoppinguserprofile.code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineShopping.shoppinguserprofile.code.dto.AddressDTO;
import com.OnlineShopping.shoppinguserprofile.code.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addrService;
	
//	@GetMapping(value="/fetchAddress", produces = "application/json")
//	public List<AddressDTO> fetchAllTheAddresses(){
//		return addrService.fetchAllAddress();
//	}
	
	@GetMapping(value="/fetchAddress", produces = "application/json")
	public String fetchAllTheAddresses(){
		return "Address";
	}
	
	@RequestMapping(value="/test")
	public String fetchAllTheAddresses1(){
		return "Address";
	}
	
}
