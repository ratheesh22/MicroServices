package com.cognizant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Country {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String code;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Country(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}
	public Country() {
		super();
	}
	
	
}
