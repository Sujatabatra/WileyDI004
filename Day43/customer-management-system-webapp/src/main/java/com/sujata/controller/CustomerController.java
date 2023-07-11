package com.sujata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.dto.entity.CustomerDetail;
import com.sujata.service.CustomerDetailsService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@RequestMapping("/")
	public ModelAndView getMainPageController() {
		return new ModelAndView("InputCustomerId");
	}
	
	@RequestMapping("/showData")
	public ModelAndView getDataController(@RequestParam("customerId") String cId) {
		ModelAndView modelAndView=new ModelAndView();
		List<CustomerDetail> customerDetails=customerDetailsService.getDetailsByCustomerId(cId);
		
		modelAndView.addObject("customerDetailsList", customerDetails);
		modelAndView.setViewName("ShowDetails");
		return modelAndView;
	}
}
