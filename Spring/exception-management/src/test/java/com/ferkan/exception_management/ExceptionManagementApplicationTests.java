package com.ferkan.exception_management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ferkan.dto.DtoEmployee;
import com.ferkan.service.IEmployeeService;
import com.ferkan.starter.ExceptionManagementStarter;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("beforeEach...");
	}
	
	// CTRL + 1
	@Test
	public void testFindEmployeeById() {
		DtoEmployee employeeById = employeeService.findEmployeeById(3L);
		
		assertNotNull(null);
		assertEquals(5,5);
		
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("afterEach...");
	}

}
