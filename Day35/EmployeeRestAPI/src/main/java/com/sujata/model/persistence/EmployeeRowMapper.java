package com.sujata.model.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.dto.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Employee employee=new Employee();
		
		employee.setEmpId(resultSet.getInt("EMPID"));
		employee.setEmpName(resultSet.getString("EMPNAME"));
		employee.setEmpDesignation(resultSet.getString("DESIGNATION"));
		employee.setEmpDepartment(resultSet.getString("DEPTT"));
		employee.setEmpSalary(resultSet.getDouble("SALARY"));
		
		return employee;
	}

}
