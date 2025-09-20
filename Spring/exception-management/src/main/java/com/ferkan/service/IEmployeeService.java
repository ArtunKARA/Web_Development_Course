package com.ferkan.service;

import com.ferkan.dto.DtoEmployee;

public interface IEmployeeService {
	
	public DtoEmployee findEmployeeById(Long id);
}
