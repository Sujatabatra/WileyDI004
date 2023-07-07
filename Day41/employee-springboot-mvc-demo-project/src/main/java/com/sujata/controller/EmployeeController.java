package com.sujata.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public ModelAndView searchEmployeeByIdController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		Employee emp = employeeService.getEmployeeById(Integer.parseInt(request.getParameter("empId")));
		if (emp != null) {
			modelAndView.addObject("employee", emp);
			modelAndView.setViewName("ShowEmployee");
		} else {
			modelAndView.addObject("message", "Employee with ID " + request.getParameter("empId") + " does not exist");
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
	public ModelAndView saveEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		int empId = Integer.parseInt(request.getParameter("eId"));
		String empName = request.getParameter("eName");
		String empDesignation = request.getParameter("eDesignation");
		String empDepartment = request.getParameter("eDepartment");
		double empSalary = Double.parseDouble(request.getParameter("eSalary"));

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
	public ModelAndView deleteEmployeeController(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();
		String message = null;
		if (employeeService.deleteEmployeeById(Integer.parseInt(request.getParameter("eId")))) {
			message = "Employee with id " + request.getParameter("eId") + " deleted !";
		} else {
			message = "Employee with id " + request.getParameter("eId") + " not deleted !";
		}
		modelAndView.addObject("message", message);
		modelAndView.setViewName("Output");
		
		return modelAndView;
	}
}
