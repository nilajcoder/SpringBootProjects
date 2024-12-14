package com.spring.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@GetMapping("/")
	@ResponseBody
	public String printBoot() {
		
		return "Spring Boot Web App";
	}
	
	@GetMapping("/py")
	@ResponseBody
	public String printPython() {
		
		return "Django Web App";
	}

}
