package com.example.springbootfirst.service;

import com.example.springbootfirst.entity.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	
	Employee updateEmployee(Employee employee);
	
	List<Employee> getAllEmployeeList();
	
	Optional<Employee> getEmployee(Long EmployeeId);
	
	void deleteEmployee(Long EmployeeId);
}
