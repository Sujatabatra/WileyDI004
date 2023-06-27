package com.sujata.model.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.dto.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Employee getRecordById(int id) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE WHERE EMPID=?", new EmployeeRowMapper(), id);
		}
		catch(EmptyResultDataAccessException ex) {
			return null;
		}
	}

	@Override
	public List<Employee> getAllRecords() {
		
		return jdbcTemplate.query("SELECT * FROM EMPLOYEE", new EmployeeRowMapper());
	}

	@Override
	public int saveRecord(Employee employee) {
		
		return jdbcTemplate.update("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)", employee.getEmpId(),employee.getEmpName(),employee.getEmpDesignation(),employee.getEmpDepartment(),employee.getEmpSalary());
	}

}
