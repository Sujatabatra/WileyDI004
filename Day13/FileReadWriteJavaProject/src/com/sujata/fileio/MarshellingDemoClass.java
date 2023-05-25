package com.sujata.fileio;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;

public class MarshellingDemoClass {

	public static void main(String[] args)throws Exception {
		LinkedList<Employee> employees=new LinkedList<Employee>();
		
		employees.add(new Employee(1, "AAAA", "Executive", "Sales", 25000));
		employees.add(new Employee(2, "BBBB", "Sr. Executive", "IT", 45000));
		employees.add(new Employee(3, "CCCC", "Associate", "Sales", 64000));
		employees.add(new Employee(4, "DDDD", "Manager", "HR", 175000));
		
		FileWriter fileWriter=new FileWriter("EmployeesData");
		PrintWriter printWriter=new PrintWriter(fileWriter);
		
		for(Employee employee:employees) {
			String empStr=employee.getEmpId()+","+employee.getEmpName()+","+employee.getEmpDesignation()+","+employee.getEmpDepartment()+","+employee.getEmpSalary();
			
			printWriter.println(empStr);
		}
		
		printWriter.flush();
		
		printWriter.close();

		fileWriter.close();
		
		System.out.println("Student Data Stored");
	}

}
