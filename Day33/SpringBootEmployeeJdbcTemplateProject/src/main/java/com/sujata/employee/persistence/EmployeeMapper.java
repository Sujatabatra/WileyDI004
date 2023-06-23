package com.sujata.employee.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sujata.employee.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		int id = resultSet.getInt("EMPID");
		String name = resultSet.getString("EMPNAME");
		String desig = resultSet.getString("DESIGNATION");
		String depart = resultSet.getString("DEPTT");
		double sal = resultSet.getDouble("SALARY");

		Employee employee = new Employee(id, name, desig, depart, sal);
		return employee;
	}

}
