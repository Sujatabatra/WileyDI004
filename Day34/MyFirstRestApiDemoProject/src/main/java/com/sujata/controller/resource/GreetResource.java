package com.sujata.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.model.service.Greet;

@RestController
public class GreetResource {

	@Autowired
	private Greet greet;
	
	//this function will be called with get Http method on /greet url and will return text response
	@GetMapping(path = "/greet",produces = MediaType.TEXT_PLAIN_VALUE)
	public String wishResource() {
		String response=greet.wish();
		return "<H1>"+response+"</H1>";
	}
	
	//this function will be called with get Http method on /wish url and will return html response
	@GetMapping(path = "/wish",produces = MediaType.TEXT_HTML_VALUE)
	public String wishResourceTwo() {
		String response=greet.wish();
		return "<H1>"+response+"</H1>";
	}
}
