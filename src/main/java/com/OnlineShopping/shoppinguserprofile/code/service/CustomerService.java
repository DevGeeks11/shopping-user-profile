package com.OnlineShopping.shoppinguserprofile.code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineShopping.shoppinguserprofile.code.dto.CustomerDTO;
import com.OnlineShopping.shoppinguserprofile.code.mapper.CustomerMapper;
import com.OnlineShopping.shoppinguserprofile.code.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerMapper custMapper;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public void saveCustomer(CustomerDTO customerDTO) {
		customerRepository.save(custMapper.buildCustomerEntity(customerDTO));
	}
}
