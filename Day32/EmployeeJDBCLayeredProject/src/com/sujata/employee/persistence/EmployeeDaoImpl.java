package com.sujata.employee.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

	@Override
	public int addRecord(Employee employee) {
		Connection connection = null;
		PreparedStatement preparedStatement;
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi004", "root", "sujata");

			preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");

			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setString(3, employee.getEmpDesignation());
			preparedStatement.setString(4, employee.getEmpDepartment());
			preparedStatement.setDouble(5, employee.getEmpSalary());

			int rows = preparedStatement.executeUpdate();

			return rows;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			return 0;
		} finally {
			try {
//				4.Close Connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public int deleteRecord(int id) {
		Connection connection = null;
		PreparedStatement preparedStatement;
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi004", "root", "sujata");

			preparedStatement = connection.prepareStatement("DELETE FROM EMPLOYEE WHERE EMPID=?");

			preparedStatement.setInt(1, id);
			

			int rows = preparedStatement.executeUpdate();

			return rows;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			return 0;
		} finally {
			try {
//				4.Close Connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public int updateRecord(int id, int increment) {
		Connection connection = null;
		PreparedStatement preparedStatement;
		Scanner scanner = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi004", "root", "sujata");

			String query="UPDATE EMPLOYEE SET SALARY=SALARY+"+increment+" where EMPID="+id;
			preparedStatement = connection.prepareStatement(query);
			
			int rows = preparedStatement.executeUpdate();

			return rows;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			return 0;
		} finally {
			try {
//				4.Close Connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}
}