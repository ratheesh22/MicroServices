package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.CountryJpa;
import com.cognizant.model.Country;

@Service
public class CountryService {
	@Autowired
	private CountryJpa jpa;
	
	public List<Country> getAll()
	{
		return jpa.findAll();
	}

}
