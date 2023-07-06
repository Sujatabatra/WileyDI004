package com.sujata.model.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements GreetService {

	@Override
	public String wish(String name) {
		
		return "Welcome "+name+" to the world of Spring Web MVC!!";
	}

}
