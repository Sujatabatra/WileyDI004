package com.sujata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.model.service.GreetService;

@Controller
public class MyGreetController {

	@Autowired
	private GreetService greetService;
	
	@RequestMapping("/")
	public ModelAndView mainPageController() {
		return new ModelAndView("InputPage");
	}
	
	/*
	 * if you need to read the data from HttpRequest Packet,
	 * always create HttpServletRequest argument in controller method
	 */
	@RequestMapping("/greet")
	public ModelAndView greetController(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		
		String na=request.getParameter("name");
		
		modelAndView.addObject("message", greetService.wish(na));
		modelAndView.setViewName("DisplayMessage");
		
		return modelAndView;		
				
	}
}
