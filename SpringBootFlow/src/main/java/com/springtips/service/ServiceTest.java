package com.springtips.service;

import org.springframework.stereotype.Component;
/*
 * 
 * 
The @Component annotation in Spring is a core part of the Spring Framework.
 It marks a Java class as a "Spring-managed component," allowing
  it to be automatically detected and registered in the Spring application
   context during component scanning.
 */
@Component
public class ServiceTest {
	
	public ServiceTest() {
		
		System.out.println("This is Service Test Constructor");
	}

}
