package com.sujata.employee.persistence;

import java.util.List;

import com.sujata.employee.entity.Employee;

public interface EmployeeDao {

	List<Employee> getAllRecords();
}
