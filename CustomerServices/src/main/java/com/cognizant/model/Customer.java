package com.cognizant.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name="customerNumber")
	private Integer customerNumber;
	@Column(name="customerName")
	private String customerName;
	@Column(name="contactLastName")
	private String contactLastName;
	@Column(name="contactFirstName")
	private String contactFirstName;
	@Column(name="phone")
	private String phone;
	@Column(name="addressLine1")
	private String addressLine1;
	@Column(name="addressLine2")
	private String addressLine2;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="postalCode")
	private String postalCode;
	@Column(name="country")
	private String country;
	@Column(name="salesRepEmployeeNumber")
	private Integer salesRepEmployeeNumber;
	@Column(name="creditLimit")
	private Double creditLimit;
	public Integer getCustomerNumber() {
		return customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getContactLastName() {
		return contactLastName;
	}
	public String getContactFirstName() {
		return contactFirstName;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public String getCountry() {
		return country;
	}
	public Integer getSalesRepEmployeeNumber() {
		return salesRepEmployeeNumber;
	}
	public Double getCreditLimit() {
		return creditLimit;
	}

}
