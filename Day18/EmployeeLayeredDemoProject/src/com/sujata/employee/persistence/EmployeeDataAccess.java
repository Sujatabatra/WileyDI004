package com.sujata.employee.persistence;

import java.util.LinkedList;

import com.sujata.employee.dto.Employee;

public interface EmployeeDataAccess {

	//Marshelling
	public boolean writeRecords(LinkedList<Employee> employees)throws Exception;
	//UnMarshelling
//	public static LinkedList<Employee> readRecords()throws Exception{
//		return null;
//	}
}
