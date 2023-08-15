package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeignCountryCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignCountryCustomerApplication.class, args);
	}

}
