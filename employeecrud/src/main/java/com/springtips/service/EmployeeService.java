package com.springtips.service;

import java.util.List;

import com.springtips.entity.Employee;

public interface EmployeeService {
	
	public String upsert(Employee employee);

	public Employee  getById(Integer id);


	public List<Employee> getAllEmployee();

	public String deleteById(Integer id);

}
