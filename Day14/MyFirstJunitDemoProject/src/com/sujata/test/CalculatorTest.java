package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sujata.demo.Calculator;
import com.sujata.exception.NegativeNumberException;

class CalculatorTest {

	//refrence variable : null
	private Calculator calculator;
	
	@BeforeEach
	void setUp() throws Exception {
		//we created the object and now my reference variable is referring/pointing to that object on heap
		calculator=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		//reference variable :null
		calculator=null;
	}

	@Test
	void r001T001() throws NegativeNumberException {
		//assertEquals(expected,function call)
		assertEquals(6, calculator.divide(12, 2));
		
	}
	
	@Test
	void r001T002()throws NegativeNumberException{
		assertThrows(NegativeNumberException.class, ()->calculator.divide(-12, 2));
	}
	
	@Test
	void r001T003()throws NegativeNumberException{
		assertThrows(NegativeNumberException.class, ()->calculator.divide(12, -2));
	}

	@Test
	void r001T004()throws NegativeNumberException{
		assertThrows(NegativeNumberException.class, ()->calculator.divide(-12, -2));
	}
	@Test
	void r001T005() throws NegativeNumberException {
		assertEquals(0, calculator.divide(0, 5));
	}
	

	@Test
	void r001T006()throws NegativeNumberException{
		assertThrows(ArithmeticException.class, ()->calculator.divide(5, 0));
	}
}
