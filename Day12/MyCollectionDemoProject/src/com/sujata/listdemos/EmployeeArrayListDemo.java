package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.List;

import com.sujata.entity.Employee;

public class EmployeeArrayListDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(101, "AAAA", 6789.75));
		empList.add(new Employee(102, "BBBB", 7189.75));
		empList.add(new Employee(103, "CCCC", 8900.00));
		empList.add(new Employee(104, "DDDD", 4528.50));
		
		for(Employee employee:empList) {
			System.out.println(employee);
		}

	}

}
