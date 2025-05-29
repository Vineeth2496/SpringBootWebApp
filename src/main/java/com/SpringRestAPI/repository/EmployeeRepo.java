package com.SpringRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.SpringRestAPI.model.Employee;
@Component
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
