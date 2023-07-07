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
		ModelAndView modelAndView=new ModelAndView();
		Employee emp=employeeService.getEmployeeById(Integer.parseInt(request.getParameter("empId")));
		if(emp!=null) {
			modelAndView.addObject("employee", emp);
			modelAndView.setViewName("ShowEmployee");
		}
		else {
			modelAndView.addObject("message", "Employee with ID "+request.getParameter("empId")+" does not exist");
			modelAndView.setViewName("Output");
			
		}
			
		
		return modelAndView;
	}
	
	@RequestMapping("/showAllEmployees")
	public ModelAndView showAllEmployeesController() {
		ModelAndView modelAndView=new ModelAndView();
		
		List<Employee> empList=employeeService.getAllEmployees();
		modelAndView.addObject("employeeList", empList);
		modelAndView.setViewName("DisplayAllEmployees");
		return modelAndView;
	}
}
