package com.ferkan.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferkan.dto.DtoEmployee;
import com.ferkan.service.IEmployeeService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@RestController
@RequestMapping("/employee")
public class EmployeeControllerImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeService employeeService;

	@GetMapping("/list/{id}")
	@Override
	public DtoEmployee findEmployeeById(@Valid @NotNull @PathVariable(name = "id", required = true) Long id) {
		return employeeService.findEmployeeById(id);
	}

}
