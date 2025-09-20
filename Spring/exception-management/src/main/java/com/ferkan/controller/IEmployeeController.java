package com.ferkan.controller;

import com.ferkan.dto.DtoEmployee;
import com.ferkan.model.RootEntity;

public interface IEmployeeController {

	public RootEntity<DtoEmployee> findEmployeeById(Long id);
	
}
