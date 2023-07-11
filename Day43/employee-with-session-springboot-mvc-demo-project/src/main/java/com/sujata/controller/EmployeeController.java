package com.sujata.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.dto.entity.Employee;
import com.sujata.dto.entity.User;
import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.UserService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private UserService userService;

	@ModelAttribute("empDeptts")
	public List<String> getDepartmentName(){
		return employeeService.getAllEmployees()
				.stream()
				.map(emp->emp.getEmpDepartment())
				.distinct()
				.toList();
	}
	
	@ModelAttribute("empIds")
	public List<Integer> getEmpIDs(){
		return employeeService.getAllEmployees()
				.stream()
				.map(emp->emp.getEmpId())
				.toList();
	}
	
	@RequestMapping("/")
	public ModelAndView getLoginPageController() {
		return new ModelAndView("LoginPage", "usr", new User());
	}
	
	@RequestMapping("/login")
	public ModelAndView loginCheckController(@ModelAttribute("usr") User user,HttpSession session) {
		ModelAndView modelAndView=new ModelAndView();
		User loginUser=userService.login(user);
		if(loginUser!=null) {
			modelAndView.setViewName("index");
			//adding objects at request scope
			modelAndView.addObject("user", loginUser);
			session.setAttribute("user", user);
		}
		else {
			modelAndView.addObject("message","Login Failed");
			modelAndView.addObject("usr", new User());
			modelAndView.setViewName("LoginPage");
			
		}
		return modelAndView;
			
	}
	
	@RequestMapping("/menuPage")
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
		ModelAndView modelAndView=new ModelAndView();
		
		modelAndView.addObject("emp", new Employee());
		modelAndView.setViewName("InputEmployeeDetails");
		return modelAndView;
//		return new ModelAndView("InputEmployeeDetails");
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
	public ModelAndView saveEmployeeController(@ModelAttribute("emp") Employee employee) {
		ModelAndView modelAndView = new ModelAndView();
	
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
		return new ModelAndView("InputEmpIdForDelete","emp",new Employee());
	}

	@RequestMapping("/deleteEmp")
	public ModelAndView deleteEmployeeController(@ModelAttribute("emp") Employee employee) {
		ModelAndView modelAndView = new ModelAndView();
		String message = null;
		int id=employee.getEmpId();
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
	
	@RequestMapping("/logout")
	public ModelAndView logoutController(HttpSession session) {
		
		session.invalidate();
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "Logout Successful");
		modelAndView.addObject("usr", new User());
		modelAndView.setViewName("LoginPage");
		return modelAndView;
	}
}

