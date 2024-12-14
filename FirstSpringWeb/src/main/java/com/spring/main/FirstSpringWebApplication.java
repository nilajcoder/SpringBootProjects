package com.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringWebApplication.class, args);
		
		System.out.println("Hello Spring Boot Started");
	}

}
