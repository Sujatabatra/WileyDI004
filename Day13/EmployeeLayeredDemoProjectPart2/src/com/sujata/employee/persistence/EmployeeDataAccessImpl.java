package com.sujata.employee.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.sujata.employee.dto.Employee;

public class EmployeeDataAccessImpl implements EmployeeDataAccess {

	@Override
	public boolean writeRecords(LinkedList<Employee> employees)throws Exception {
		FileWriter fileWriter=new FileWriter("EmployeesData");
		PrintWriter printWriter=new PrintWriter(fileWriter);
		
		for(Employee employee:employees) {
			String empStr=employee.getEmpId()+","+employee.getEmpName()+","+employee.getEmpDesignation()+","+employee.getEmpDepartment()+","+employee.getEmpSalary();
			
			printWriter.println(empStr);
		}
		
		printWriter.flush();
		
		printWriter.close();

		fileWriter.close();
		return true;
	}

	@Override
	public LinkedList<Employee> readRecords()throws Exception {
		LinkedList<Employee> employees=new LinkedList<Employee>();
		
		FileReader fileReader = new FileReader("EmployeesData");

		// read the content from buffer
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		Scanner scanner = new Scanner(bufferedReader);
		while (scanner.hasNext()) {
			String currentLine = scanner.nextLine();
			/*
			 * currentLine=1,AAAA,Executive,Sales,25000.0
			 * values[]={"1","AAAA","Executive","Sales","25000.0"}
			 * 
			 */
			String values[]=currentLine.split(",");
			
			Employee employee=new Employee(Integer.parseInt(values[0]), values[1], values[2], values[3],Double.parseDouble(values[4]));
			
			employees.add(employee);
		}
		fileReader.close();
		bufferedReader.close();
		
		return employees;
	}

}
