package com.sujata.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.dto.entity.Employee;
import com.sujata.model.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/")
	public ModelAndView welcomePageController() {
		return new ModelAndView("index");
	}

	@RequestMapping("/InputEmpIdPage")
	public ModelAndView InputEmpIdPageController() {
		return new ModelAndView("InputEmployeeID");
	}

	@RequestMapping("/searchEmployeeById")
	public ModelAndView searchEmployeeByIdController(@RequestParam("empId") int id) {
		ModelAndView modelAndView = new ModelAndView();
		Employee emp = employeeService.getEmployeeById(id);
		if (emp != null) {
			modelAndView.addObject("employee", emp);
			modelAndView.setViewName("ShowEmployee");
		} else {
			modelAndView.addObject("message", "Employee with ID " + id + " does not exist");
			modelAndView.setViewName("Output");

		}

		return modelAndView;
	}

	@RequestMapping("/InputEmployeeDetails")
	public ModelAndView InputEmployeeDetailsPageController() {
		return new ModelAndView("InputEmployeeDetails");
	}

	@RequestMapping("/showAllEmployees")
	public ModelAndView showAllEmployeesController() {
		ModelAndView modelAndView = new ModelAndView();

		List<Employee> empList = employeeService.getAllEmployees();
		modelAndView.addObject("employeeList", empList);
		modelAndView.setViewName("DisplayAllEmployees");
		return modelAndView;
	}

	@RequestMapping("/saveEmployee")
	public ModelAndView saveEmployeeController(@RequestParam("eId") int empId,
			@RequestParam("eName")String empName,@RequestParam("eDesignation")String empDesignation,
			@RequestParam("eDepartment")String empDepartment,@RequestParam("eSalary")double empSalary) {
		ModelAndView modelAndView = new ModelAndView();
	

		Employee employee = new Employee(empId, empName, empDesignation, empDepartment, empSalary);

		String message = null;
		if (employeeService.addEmployee(employee))
			message = "Employee Added";
		else
			message = "Employee Not Added";

		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");

		return modelAndView;
	}

	@RequestMapping("/InputEmpIDPageForDelete")
	public ModelAndView inputEmpIdPageForDeleteController() {
		return new ModelAndView("InputEmpIdForDelete");
	}

	@RequestMapping("/deleteEmp")
	public ModelAndView deleteEmployeeController(@RequestParam("eId") int id) {
		ModelAndView modelAndView = new ModelAndView();
		String message = null;
		if (employeeService.deleteEmployeeById(id)) {
			message = "Employee with id " + id + " deleted !";
		} else {
			message = "Employee with id " + id + " not deleted !";
		}
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
	
	@RequestMapping("/InputEmpDetailsPageForUpdate")
	public ModelAndView InputEmpDetailsPageForUpdateController(){
		return new ModelAndView("InputEmpDetailsForUpdate");
	}
	
	
	@RequestMapping("/updateEmpSalary")
	public ModelAndView updateEmployeeSalaryController(@RequestParam("eId") int empId,@RequestParam("amount") double incrementAmount) {
		
		String message=null;
		
		if(employeeService.incrementSalary(empId, incrementAmount))
			message="Salary Incremented for Employee ID "+empId;
		else
			message="Salary Incremented for Employee ID "+empId;
		
		return new ModelAndView("Output", "message", message);
	}
}
