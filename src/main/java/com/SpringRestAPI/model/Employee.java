package com.SpringRestAPI.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_tab")
public class Employee {
	@Id
	@Column(name = "e_id")
	private Integer eId;
	@Column(name = "e_name")
	private String eName;
	@Column(name = "e_sal")
	private Double eSal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer eId, String eName, Double eSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Double geteSal() {
		return eSal;
	}
	public void seteSal(Double eSal) {
		this.eSal = eSal;
	}
	
}
