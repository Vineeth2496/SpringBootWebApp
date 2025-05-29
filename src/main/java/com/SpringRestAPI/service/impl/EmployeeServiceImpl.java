package com.SpringRestAPI.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRestAPI.model.Employee;
import com.SpringRestAPI.repository.EmployeeRepo;
import com.SpringRestAPI.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepo erepo;
	
	@Override
	public void saveEmployee(Employee e) {
		erepo.save(e);

	}

	@Override
	public List<Employee> getEmployee() {
		
		return null;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		
		return null;	
	}

	@Override
	public Employee updateEmployee(Integer id, Employee e) {
		
		return null;
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		
	}

}
