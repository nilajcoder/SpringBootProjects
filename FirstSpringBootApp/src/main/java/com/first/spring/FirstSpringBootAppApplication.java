package com.first.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootAppApplication.class, args);
		System.out.println("Hello Spring Boot");
	}

}
