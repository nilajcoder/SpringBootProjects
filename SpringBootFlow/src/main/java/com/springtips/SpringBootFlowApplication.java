package com.springtips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
 * 
 @SpringBootApplication: is a core annotation in the Spring Boot framework.
                         It is used to indicate that the class it annotates is the main entry point for a Spring Boot application. 




@SpringBootApplication=@Configuration+@EnableAutoConfiguration+@ComponentScan

@Configuration: Indicates that a class declares one or more @Bean methods, which are processed by the Spring container.

@Configuration annotation indicates that a class declares one or more @Bean methods and may be processed by
 the Spring container to generate bean definitions and service requests for those beans at runtime.

Since spring 2, we were writing our bean configurations to xml files. But Spring 3 gave the freedom to move bean 
definitions out of xml files. We can give bean definitions in Java files itself. 
This is called Spring Java Config feature (using @Configuration annotation).

@EnableAutoConfiguration > > - The @EnableAutoConfiguration annotation tells Spring Boot to "guess" 
how you want to configure Spring,based on the jar dependencies that you have added.
 The @EnableAutoConfiguration annotation auto-configures the beans that are present in the classpath.
  This simplifies the developer's work by guessing the required beans from the classpath and configuring
   them to run the application.


@ComponentScan > > - @ComponentScan tells Spring to look for other components, configurations, and services in 
the specified package.Spring is able to auto scan, detect and register your beans or components from 
the pre-defined project package.If no package is specified, the current class package is taken as the root package.
 */
@SpringBootApplication
public class SpringBootFlowApplication {

	public static void main(String[] args) {
		
		System.out.println("Execution Start");
		SpringApplication.run(SpringBootFlowApplication.class, args);
		
		System.out.println("Execution End");
	}

}
