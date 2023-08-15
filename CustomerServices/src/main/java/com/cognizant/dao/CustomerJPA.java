package com.cognizant.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.model.Customer;

public interface CustomerJPA extends JpaRepository<Customer, Integer> {
	
	List<Customer> findByCity(String city);
	List<Customer> findByCustomerNumber(Integer customerNumber);

}
