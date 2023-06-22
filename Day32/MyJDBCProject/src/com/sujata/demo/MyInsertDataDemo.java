package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MyInsertDataDemo {

	public static void main(String[] args) {
		/*
		 * Steps 1. Register Driver 2. Connect 2.1 Connect to database 2.2
		 * Prepare/Execute Query 3. Processing The result of query 4. Close the
		 * Connection
		 */

		Connection connection = null;
		PreparedStatement preparedStatement;
		Scanner scanner = new Scanner(System.in);
		try {
//			1.Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			2.Connect
//			2.1 Connect to Database
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi004", "root", "sujata");
			// 2.2 Prepare/Execute Query
			preparedStatement = connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");

			System.out.println("Enter Employee ID : ");
			int id = scanner.nextInt();
			preparedStatement.setInt(1, id);

			System.out.println("Enter Employee Name : ");
			String name = scanner.next();
			preparedStatement.setString(2, name);

			System.out.println("Enter Employee Designation : ");
			String desig = scanner.next();
			preparedStatement.setString(3, desig);

			System.out.println("Enter Employee Department : ");
			String depart = scanner.next();
			preparedStatement.setString(4, depart);

			System.out.println("Enter Employee Salary : ");
			double sal = scanner.nextDouble();
			preparedStatement.setDouble(5, sal);

			// if you are writing DML Query then use executeUpdate()
			int rows = preparedStatement.executeUpdate();

//			3.Process Result
			if (rows > 0)
				System.out.println("Employee Addded");
			else
				System.out.println("Employee Not Added");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {

			System.out.println("Employee Not Added");
		} finally {
			try {
//				4.Close Connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
