package com.capgemini.go.retailer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@EnableJpaRepositories
@SpringBootApplication
public class RetailerInventoryMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailerInventoryMsApplication.class, args);
		System.out.println("Spring boot is Running.....!!!!");
	}

}
