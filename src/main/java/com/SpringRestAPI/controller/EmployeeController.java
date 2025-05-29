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
	
	//http://localhost:8080/api/save
	
	@PostMapping("/save")
	public String saveEmp(@RequestBody Employee emp) {
		eserv.saveEmployee(emp);
		return "Record Inserted";
	}
//	@GetMapping("/get")
//	public String getEmp() {
//		return "Employee Details";
//	}
	
	
	// http://localhost:8080/api/getall
	@GetMapping("/getall")
	public List<Employee> getAllEmployee(){
		List<Employee> lemp=eserv.getEmployee();
		return lemp;
	}
	
	//http://localhost:8080/api/get/1001
	@GetMapping("/get/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {
		Employee emp=eserv.getEmployeeById(id);
		return emp;
	}
	
	// http://localhost:8080/api/update/1001
	@PutMapping("/update/{id}")
	public Employee updateEmpById(@PathVariable Integer id, @RequestBody Employee emp) {
		Employee nEmp=eserv.updateEmployee(id, emp);
		return nEmp;
	}
	// http://localhost:8080/
	@DeleteMapping("/delete/{id}")
	public String deleteEmpById(@PathVariable Integer id) {
		eserv.deleteEmployeeById(id);
		return "Record Deleted Successfully";
	}
}
