package com.ferkan.controller;

import com.ferkan.dto.DtoEmployee;

public interface IEmployeeController {

	public DtoEmployee findEmploeeById(Long Id);
}
