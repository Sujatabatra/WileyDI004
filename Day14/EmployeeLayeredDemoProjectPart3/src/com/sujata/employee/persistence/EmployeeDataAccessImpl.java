package com.sujata.employee.persistence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.sujata.employee.dto.Employee;

public class EmployeeDataAccessImpl implements EmployeeDataAccess {

	@Override
	public boolean writeRecords(LinkedList<Employee> employees) {
		FileWriter fileWriter=null;
		try {
			fileWriter = new FileWriter("EmployeesData");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter printWriter=new PrintWriter(fileWriter);
		
		for(Employee employee:employees) {
			String empStr=employee.getEmpId()+","+employee.getEmpName()+","+employee.getEmpDesignation()+","+employee.getEmpDepartment()+","+employee.getEmpSalary();
			
			printWriter.println(empStr);
		}
		
		printWriter.flush();
		
		printWriter.close();

		try {
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public LinkedList<Employee> readRecords(){
		LinkedList<Employee> employees=new LinkedList<Employee>();
		
		FileReader fileReader=null;
		try {
			fileReader = new FileReader("EmployeesData");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
		try {
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return employees;
	}

}
