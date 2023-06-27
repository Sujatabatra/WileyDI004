package com.sujata.model.persistence;

import java.sql.SQLIntegrityConstraintViolationException;
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
		} catch (EmptyResultDataAccessException ex) {
			return null;
		}
	}

	@Override
	public List<Employee> getAllRecords() {

		return jdbcTemplate.query("SELECT * FROM EMPLOYEE", new EmployeeRowMapper());
	}

	@Override
	public int saveRecord(Employee employee) {
		try {

			return jdbcTemplate.update("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)", employee.getEmpId(),
					employee.getEmpName(), employee.getEmpDesignation(), employee.getEmpDepartment(),
					employee.getEmpSalary());
		} catch (Exception ex) {
			return 0;
		}
	}

	@Override
	public int deleteRecord(int empId) {
		try {
			return jdbcTemplate.update("DELETE FROM EMPLOYEE WHERE EMPID=?", empId);
		} catch (Exception ex) {
			return 0;
		}
	}

	@Override
	public int updateSalaryofRecord(int empId, int salary) {
		try {
			return jdbcTemplate.update("UPDATE EMPLOYEE SET SALARY=? WHERE EMPID=?", salary, empId);
		} catch (Exception ex) {
			return 0;
		}
	}
}
