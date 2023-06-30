package com.sujata.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEEJPA")
public class Employee {

	@Id
	@Column(name = "id")
	private int empId;
	@Column(name = "name",length = 30)
	private String empName;
	private String designation;
	private String department;
	@Column(name = "basicSalary")
	private double salary;
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, String designation, String department, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", department="
				+ department + ", salary=" + salary + "]";
	}
	
	
	
}

