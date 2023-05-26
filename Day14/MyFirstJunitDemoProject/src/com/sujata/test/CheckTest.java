package com.sujata.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("SetupBeforeClass");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("TearDownAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("SetUp");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	void testDivide1() {
		System.out.println("TestCase 1");
	}
	
	@Test
	void testDivide2() {
		System.out.println("TestCase 2");
	}
	@Test
	void testDivide3() {
		System.out.println("TestCase 3");
	}

}
