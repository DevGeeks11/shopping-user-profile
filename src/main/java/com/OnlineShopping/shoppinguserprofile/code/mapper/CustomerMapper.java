package com.OnlineShopping.shoppinguserprofile.code.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.OnlineShopping.shoppinguserprofile.code.entity.Customer;

@Component
public class CustomerMapper {

	public List<Customer> fetchCustomerEntityList(){
		List<Customer> customerList = new ArrayList<>();
		Customer cust = new Customer();
		
		cust.setEmail("abc@gmail.com");
		cust.setId("CU1001");
		cust.setMobileNumber(9898989898L);
		cust.setName("Mr. Jay Pritchett");
		cust.setPassword("password");
		cust.setType("Existing");
		customerList.add(cust);
		
		return customerList;
	}
}
