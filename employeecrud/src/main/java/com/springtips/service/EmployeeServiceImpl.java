package com.springtips.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtips.entity.Employee;
import com.springtips.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public String upsert(Employee employee) {
		// TODO Auto-generated method stub
		empRepo.save(employee);
		return "success";
	}

	@Override
	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> findById = empRepo.findById(id);

		if (findById.isPresent()) {
			return findById.get();
		}

		return null;

	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		// TODO Auto-generated method stub
		if (empRepo.existsById(id)) {
			empRepo.deleteById(id);
			return "Delete Success";
		} else {
			return "No Record Found";
		}
	
	}

}
