package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {
	@Autowired
	private Country country;
	@Autowired
	private Customer customer;
	
	@GetMapping("/country")
	public Object getCountry()
	{
		return country.getCountry();
	}
	
	@GetMapping("/customer")
	public Object getCustomer()
	{
		return customer.getCustomer();
	}

}
