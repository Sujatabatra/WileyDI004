package com.sujata.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.sujata.model.persistence.EmployeeDao;

@SpringBootTest
@ActiveProfiles("test")
class EmployeeRestApiApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	@Test
	void testDeleteOne() {
		assertEquals(1, employeeDao.deleteRecord(101));
	}
	
	void testDeleteTwo() {
		assertEquals(0, employeeDao.deleteRecord(100));
	}
	

}
