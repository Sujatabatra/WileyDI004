package com.sujata.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class UnMarshellingDemoClass {

	public static void main(String[] args)throws Exception {

		ArrayList<Employee> employees=new ArrayList<Employee>();
		
		FileReader fileReader = new FileReader("EmployeesData");

		// read the content from buffer
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		Scanner scanner = new Scanner(bufferedReader);
		while (scanner.hasNext()) {
			String currentLine = scanner.nextLine();
			
			String values[]=currentLine.split(",");
			Employee employee=new Employee(Integer.parseInt(values[0]), values[1], values[2], values[3],Double.parseDouble(values[4]));
			employees.add(employee);
		}
		fileReader.close();
		bufferedReader.close();

		for(Employee employee:employees) {
			System.out.println(employee);
		}
	}

}
