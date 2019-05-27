package com.example.springbootfirst.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootfirst.dao.EmployeeDao;
import com.example.springbootfirst.entity.Employee;
import com.example.springbootfirst.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.saveAndFlush(employee);
	}

	@Override
	public List<Employee> getAllEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.findById(employeeId);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(employeeId);

	}

}
