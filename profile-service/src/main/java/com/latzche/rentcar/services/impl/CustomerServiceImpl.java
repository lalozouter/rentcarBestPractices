package com.latzche.rentcar.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latzche.rentcar.repository.CustomerRepository;
import com.latzche.rentcar.services.CustomerService;
import com.latzche.rentcloud.commons.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

}
