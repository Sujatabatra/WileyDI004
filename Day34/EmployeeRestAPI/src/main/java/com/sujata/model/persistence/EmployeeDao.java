package com.sujata.model.persistence;

import java.util.List;

import com.sujata.dto.entity.Employee;

public interface EmployeeDao {

	public Employee getRecordById(int id);
	public List<Employee> getAllRecords();
}
