package com.hsbc.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Successfully integrated jenkins with maven and docker
//Auto bulid trigger initialized after every 2 minutes
public class CrmapiApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CrmapiApplication.class, args);
	}

}
