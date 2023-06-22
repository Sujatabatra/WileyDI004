package com.sujata.employee.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sujata.employee.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<Employee> getAllRecords() {
		Connection connection = null;
		PreparedStatement preparedStatement;
		List<Employee> employeeList = new ArrayList<Employee>();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi004", "root", "sujata");

			preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("EMPID");
				String name = resultSet.getString("EMPNAME");
				String desig = resultSet.getString("DESIGNATION");
				String depart = resultSet.getString("DEPTT");
				double sal = resultSet.getDouble("SALARY");

				Employee employee = new Employee(id, name, desig, depart, sal);
				employeeList.add(employee);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return employeeList;
		}

	}
}