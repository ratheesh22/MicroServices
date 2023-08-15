package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.dao.CountryJpa;
import com.cognizant.model.Country;
import com.cognizant.service.CountryService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class CountryController {
	@Autowired
	private CountryService country;
	
	@GetMapping("/country")
	public ResponseEntity<List<Country>> getAll()
	{
		
		ResponseEntity<List<Country>> re=new ResponseEntity<>(country.getAll(),HttpStatus.ACCEPTED);
		return re;
		
		
	}
		
		
		
	}

