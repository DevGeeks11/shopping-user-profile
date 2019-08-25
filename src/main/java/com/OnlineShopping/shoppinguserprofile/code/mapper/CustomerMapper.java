package com.OnlineShopping.shoppinguserprofile.code.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.OnlineShopping.shoppinguserprofile.code.dto.CustomerDTO;
import com.OnlineShopping.shoppinguserprofile.code.entity.Customer;

@Component
public class CustomerMapper {

	public List<Customer> buildCustomerEntityList(List<CustomerDTO> customerDTOList){
		List<Customer> customerList = new ArrayList<>();
		customerDTOList.stream().forEach(custDTO ->{
			Customer customer = new Customer();
			customer.setId(custDTO.getCustId());
			customer.setEmail(custDTO.getEmailId());
			customer.setPassword(custDTO.getPassword());
			customer.setMobileNumber(custDTO.getMobileNumber());
			customer.setGender(custDTO.getGender());
		});
		return customerList;
	}
	
	public Customer buildCustomerEntity(CustomerDTO custDTO){
		Customer customer = new Customer();
		customer.setId(custDTO.getCustId());
		customer.setEmail(custDTO.getEmailId());
		customer.setPassword(custDTO.getPassword());
		customer.setMobileNumber(custDTO.getMobileNumber());
		customer.setGender(custDTO.getGender());

		return customer;
	}
	
	public CustomerDTO buildCustomerDTO(Customer customer){
		CustomerDTO custDTO = new CustomerDTO();
		custDTO.setCustId(customer.getId());
		custDTO.setEmailId(customer.getEmail());
		custDTO.setPassword(customer.getPassword());
		custDTO.setMobileNumber(customer.getMobileNumber());
		custDTO.setGender(customer.getGender());

		return custDTO;
	}
}
