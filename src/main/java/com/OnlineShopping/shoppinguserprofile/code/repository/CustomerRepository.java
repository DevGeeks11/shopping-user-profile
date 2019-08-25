package com.OnlineShopping.shoppinguserprofile.code.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.OnlineShopping.shoppinguserprofile.code.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,String>{
}