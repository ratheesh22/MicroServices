package com.cognizant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.model.Country;

public interface CountryJpa extends JpaRepository<Country, Integer> {
	

}
