package com.sujata.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.model.service.GreetService;

@RestController
public class GreetResource {

	@Autowired
	private GreetService greetService;
	
	@GetMapping(path = "/greet/{na}",produces = MediaType.TEXT_PLAIN_VALUE)
	public String wishResource(@PathVariable("na") String name) {
		return greetService.wish(name);
	}
}
