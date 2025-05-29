package com.SpringRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRestAPI.model.Employee;
import com.SpringRestAPI.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService eserv;
	//http://localhost:9090/api/save
	
	@PostMapping("/save")
	public String saveEmp(@RequestBody Employee emp) {
		eserv.saveEmployee(emp);
		return "Record Inserted";
	}
//	@GetMapping("/get")
//	public String getEmp() {
//		return "Employee Details";
//	}
	
	public List<Employee> getAllEmployee(){
		return null;
	}
	
}
