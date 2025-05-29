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
		List<Employee> lemp=erepo.findAll();
		
		return lemp;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Optional<Employee> oemp=erepo.findById(id);
		Employee emp=oemp.get();
		return emp;	
	}

	@Override
	public Employee updateEmployee(Integer id, Employee e) {
		Optional<Employee> oEmp=erepo.findById(id);
		Employee nEmp=oEmp.get();
		
		nEmp.seteName( e.geteName());
		nEmp.seteSal( e.geteSal());
		
		erepo.save(nEmp);
		return nEmp;
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		erepo.deleteById(id);
	}

}
