package com.sujata.dto.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="NewProject")
public class Project {

	@Id
	private String projectId;
	private String projectName;
	@OneToMany
	private List<Employee> employeeList=new ArrayList<Employee>(); 
	
	public Project() {
		
	}

	public Project(String projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
}
