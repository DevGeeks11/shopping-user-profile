package com.OnlineShopping.shoppinguserprofile.code.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineShopping.shoppinguserprofile.code.dto.AddressDTO;
import com.OnlineShopping.shoppinguserprofile.code.service.AddressService;

@RestController
@RequestMapping(path = "/address-service")
public class AddressController {

	@Autowired
	private AddressService addrService;
	
	@GetMapping(value = "/fetchAddress", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<AddressDTO> fetchAllTheAddresses(){
		return addrService.fetchAllAddress();
	}
	
	@GetMapping(value="/saveAddress")
	public void saveAddress() {
		addrService.saveAddress();
	}
}
