package com.sujata.employee.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.employee.entity.Employee;

@Repository("empDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getAllRecords() {
		String query = "SELECT * FROM EMPLOYEE";
		return jdbcTemplate.query(query, new EmployeeMapper());
	}

	@Override
	public int addRecord(Employee employee) {

		String query = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";
		return jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(), employee.getEmpDesignation(),
				employee.getEmpDepartment(), employee.getEmpSalary());

	}

	@Override
	public int deleteRecord(int id) {
		String query = "DELETE FROM EMPLOYEE WHERE EMPID=?";
		return jdbcTemplate.update(query, id);
	}

	@Override
	public int updateRecord(int id, int increment) {
		String query = "UPDATE EMPLOYEE SET SALARY=SALARY+" + increment + " where EMPID=" + id;
		return jdbcTemplate.update(query);
	}

	@Override
	public Employee searchRecordById(int id) {
		String query="SELECT * FROM EMPLOYEE WHERE EMPID="+id;
		try {
		return jdbcTemplate.queryForObject(query, new EmployeeMapper());
		}
		catch(EmptyResultDataAccessException exception) {
			return null;
		}
	}
}