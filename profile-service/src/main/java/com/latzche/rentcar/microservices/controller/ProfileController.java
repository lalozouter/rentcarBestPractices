package com.latzche.rentcar.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.latzche.rentcar.services.CustomerService;
import com.latzche.rentcloud.commons.model.Customer;

@RestController
@RequestMapping(value = "/services" )
public class ProfileController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/profile",method=RequestMethod.POST)
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer) ;
		
	}
	
}
