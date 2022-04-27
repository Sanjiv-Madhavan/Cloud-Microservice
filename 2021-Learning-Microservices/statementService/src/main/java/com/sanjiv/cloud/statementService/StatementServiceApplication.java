package com.sanjiv.cloud.statementService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StatementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatementServiceApplication.class, args);
	}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
	   // Do any additional configuration here
	   return new RestTemplate();
	}

}
