package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStandAloneApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot Started Application");
		SpringApplication.run(SpringBootStandAloneApplication.class, args);
		System.out.println("Spring Boot Execution Compleate");
	}

}
