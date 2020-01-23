package com.latzche.rentcar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.latzche.rentcloud.commons.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
