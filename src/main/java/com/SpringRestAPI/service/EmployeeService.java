package com.SpringRestAPI.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.SpringRestAPI.model.Employee;
@Component
public interface EmployeeService {
	
	void saveEmployee(Employee e);
	
	List<Employee> getEmployee();
	
	Employee getEmployeeById(Integer id);
	
	Employee updateEmployee(Integer id, Employee e);
	
	void deleteEmployeeById(Integer id);
	
}
