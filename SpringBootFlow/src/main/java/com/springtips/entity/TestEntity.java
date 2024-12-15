package com.springtips.entity;

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
public class TestEntity {
	
	public TestEntity() {
		System.out.println("This is Test Entity Constructor");
	}

}
