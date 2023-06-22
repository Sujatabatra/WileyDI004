package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyReadDataDemo {

	public static void main(String[] args) {
		/*
		 * Steps
		 * 1. Register Driver
		 * 2. Connect
		 * 2.1 Connect to database
		 * 2.2 Prepare/Execute Query
		 * 3. Processing The result of query
		 * 4. Close the Connection
		 */
		
		Connection connection=null;
		PreparedStatement preparedStatement;
		try {
//			1.Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			2.Connect
//			2.1 Connect to Database
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi004", "root", "sujata");
			//2.2 Prepare/Execute Query
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");
			
			//if you are writing DQL Query then use executeQuery()
			ResultSet resultSet= preparedStatement.executeQuery();
			
//			3.Process Result
			while(resultSet.next()) {
				int id=resultSet.getInt("EMPID");
				String name=resultSet.getString("EMPNAME");
				String desig=resultSet.getString("DESIGNATION");
				String depart=resultSet.getString("DEPTT");
				double sal=resultSet.getDouble("SALARY");
				System.out.println(id+"  "+name+"  "+desig+"  "+depart+"  "+sal);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
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
