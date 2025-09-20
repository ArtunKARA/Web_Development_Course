package com.ferkan.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferkan.controller.ICustomerControler;
import com.ferkan.dto.DtoCustomer;
import com.ferkan.services.ICustomerService;

@RestController
@RequestMapping("/rest/api/customer")
public class CustomerControlerImpl implements ICustomerControler{

	@Autowired
	ICustomerService customerService;
	
	@GetMapping(path = "/list/{id}")
	@Override
	public DtoCustomer findCustomerById(@PathVariable(name = "id", required = true) Long id) {
		return customerService.findCustomerById(id);
	}
	
}
