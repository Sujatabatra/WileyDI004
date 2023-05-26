package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sujata.demo.Calculator;

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
	void r001T001() {
		//assertEquals(expected,function call)
		assertEquals(6, calculator.divide(12, 2));
		
	}
	
	void r001T005() {
		assertEquals(0, calculator.divide(0, 5));
	}

}
