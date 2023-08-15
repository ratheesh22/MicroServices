package com.cognizant.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="customer")
public interface Customer {
	@GetMapping("/customer")
	public Object getCustomer();

}
