package com.springtips.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springtips.entity.Employee;
import com.springtips.service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/employee")
	public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
		String status = empService.upsert(employee);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Integer id) {
		Employee employee = empService.getById(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> allCourses = empService.getAllEmployee();
		return new ResponseEntity<>(allCourses, HttpStatus.OK);
	}

	@PutMapping("/employee")
	public ResponseEntity<String> updateCourse(@RequestBody Employee employee) {
		String status = empService.upsert(employee);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

	@DeleteMapping("/employee/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {
		String status = empService.deleteById(id);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
