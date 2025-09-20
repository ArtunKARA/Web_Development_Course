package com.ferkan.controller;

import java.util.List;

import com.ferkan.dto.DtoEmployee;

public interface IEmployeeController {
	public List<DtoEmployee> findAllEmployee();
}
