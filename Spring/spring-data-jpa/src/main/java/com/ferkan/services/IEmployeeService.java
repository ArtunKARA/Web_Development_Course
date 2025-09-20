package com.ferkan.services;

import java.util.List;

import com.ferkan.dto.DtoEmployee;

public interface IEmployeeService {
	
	public List<DtoEmployee> findAllEmployee();
	
}
