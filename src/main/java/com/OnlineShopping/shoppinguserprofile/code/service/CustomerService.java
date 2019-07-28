package com.OnlineShopping.shoppinguserprofile.code.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineShopping.shoppinguserprofile.code.dto.CustomerDTO;
import com.OnlineShopping.shoppinguserprofile.code.entity.Customer;
import com.OnlineShopping.shoppinguserprofile.code.mapper.CustomerMapper;

@Service
public class CustomerService {

	@Autowired
	private CustomerMapper custMapper;
	
	public List<CustomerDTO> fetchAllCustomer(){
		return mapEntityToDto(custMapper.fetchCustomerEntityList());
	}
	
	private List<CustomerDTO> mapEntityToDto(List<Customer> custEntityList){
		List<CustomerDTO> dtoList = new ArrayList<>();
		
		custEntityList.forEach(entityObj -> {
		CustomerDTO dtoObj = new CustomerDTO();
		dtoObj.setEmail(entityObj.getEmail());
		dtoObj.setId(entityObj.getId());
		dtoObj.setMobileNumber(entityObj.getMobileNumber());
		dtoObj.setName(entityObj.getName());
		dtoObj.setPassword(entityObj.getPassword());
		dtoObj.setType(entityObj.getType());
		
		dtoList.add(dtoObj);
		});
		
		return dtoList;
	}	
}
