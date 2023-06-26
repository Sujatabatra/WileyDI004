package com.sujata.model.persistence;

import com.sujata.dto.entity.Employee;

public interface EmployeeDao {

	public Employee getRecordById(int id);
}
