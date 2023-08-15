package com.cognizant.controller;
import com.cognizant.model.Customer;
import com.cognizant.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomers(){
		
		return service.getAlldata();
	}
	@GetMapping("/name")
	public List<String> getName(){
		
		return service.getAllNameAndCity();
	}
	
	
	
}
