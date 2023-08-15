package com.cognizant.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="country")
public interface Country {
	@GetMapping("/country")
	public Object getCountry();

}
