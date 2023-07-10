package com.sujata.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	private int empId;
	
	@Min(value = 5,message = "Name must be minimum of 5 characters long")
	@NotBlank(message = "Name cannot be left blank")
	private String empName;
	
	@NotBlank(message = "Designation cannot be left blank")
	@Column(name="designation")
	private String empDesignation;
	
	@NotBlank(message="Department cannot be left blank")
	@Column(name="deptt")
	private String empDepartment;
	
	
	@Column(name="salary")
	private double empSalary;
}
