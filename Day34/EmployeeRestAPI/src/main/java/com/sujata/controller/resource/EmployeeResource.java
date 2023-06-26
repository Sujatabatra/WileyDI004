package com.sujata.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.dto.entity.Employee;
import com.sujata.dto.entity.EmployeeList;
import com.sujata.model.service.EmployeeService;

@RestController
public class EmployeeResource {
	
	@Autowired
	EmployeeService employeeService;
	
//	@GetMapping(path = "/employees/{empId}",produces = MediaType.APPLICATION_JSON_VALUE)
//	public Employee searchEmployeeByIdResource(@PathVariable("empId") int id) {
//		return employeeService.searchEmployeeById(id);
//	}

	@GetMapping(path = "/employees/{empId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> searchEmployeeByIdResource(@PathVariable("empId") int id) {
		Employee employee=employeeService.searchEmployeeById(id);
		ResponseEntity response=null;
		if(employee!=null)
			response=new ResponseEntity<Employee>(employee, HttpStatus.FOUND);
		else
			response=new ResponseEntity<Employee>(employee,HttpStatus.NOT_FOUND);
		return response;
	}
	
//	@GetMapping(path="/employees",produces = MediaType.APPLICATION_JSON_VALUE )
//	public EmployeeList getAllEmployees() {
//		return new EmployeeList(employeeService.getAllEmployees());
//	}
	
	@GetMapping(path="/employees",produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<EmployeeList> getAllEmployees() {
		EmployeeList employeeList= new EmployeeList(employeeService.getAllEmployees());
		if(employeeList.getEmployees().size()>0)
			return new ResponseEntity<EmployeeList>(employeeList,HttpStatus.OK);
		else
			return new ResponseEntity<EmployeeList>(employeeList,HttpStatus.NO_CONTENT);
	}
}
