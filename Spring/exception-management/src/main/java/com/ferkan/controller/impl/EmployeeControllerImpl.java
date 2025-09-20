package com.ferkan.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferkan.controller.IEmployeeController;
import com.ferkan.dto.DtoEmployee;
import com.ferkan.model.RootEntity;
import com.ferkan.service.IEmployeeService;

@RestController
@RequestMapping(path = "/rest/api/employee")
public class EmployeeControllerImpl extends RootBaseController implements IEmployeeController{

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping(path = "/list/{id}")
	@Override
	public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
		return ok(employeeService.findEmployeeById(id));
	}
	
	
}
