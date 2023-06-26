package com.sujata.controller.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.model.service.CalculatorService;

@RestController
public class CalculatorResource {

	@Autowired
	private CalculatorService calculatorService;

	@GetMapping(path = "/addition/{num1}/{num2}")
	public Long addResource(@PathVariable("num1") int number1, @PathVariable("num2") int number2) {
		return calculatorService.add(number1, number2);
	}

	@GetMapping(path = "/minus/{num1}/{num2}")
	public Integer minusResource(@PathVariable("num1") int number1, @PathVariable("num2") int number2) {
		return calculatorService.minus(number1, number2);
	}

	@GetMapping(path = "/multiply/{n1}/{n2}")
	public Long multiplyResource(@PathVariable("n1") int number1, @PathVariable("n2") int number2) {
		return calculatorService.multiply(number1, number2);
	}

	@GetMapping(path = "/divide/{n1}/{n2}")
	public String divideResource(@PathVariable("n1") int number1,@PathVariable("n2") int number2) {
		try {
			return calculatorService.divide(number1, number2) + " ";
		} catch (ArithmeticException ex) {
			return "Undefined";
		}
	}
}
