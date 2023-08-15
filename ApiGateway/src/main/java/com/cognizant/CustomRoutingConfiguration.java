package com.cognizant;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomRoutingConfiguration {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder)
	{
		
		return builder.routes()
				.route(a->a.path("/country").uri("lb://country"))
				.route(b->b.path("/customer").uri("lb://customer"))
				.route(c->c.path("/feign/country").uri("lb://customer-country-service"))
				.route(c->c.path("/feign/customer").uri("lb://customer-country-service"))

				
				.build();
	}

}
