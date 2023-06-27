package com.sujata.model.persistence;

import java.util.List;

import com.sujata.dto.entity.Employee;

public interface EmployeeDao {

	public Employee getRecordById(int id);
	public List<Employee> getAllRecords();
	public int saveRecord(Employee employee);
	public int deleteRecord(int empId);
	public int updateSalaryofRecord(int empId,int salary);
}
