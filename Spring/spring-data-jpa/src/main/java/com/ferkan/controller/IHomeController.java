package com.ferkan.controller;

import com.ferkan.dto.DtoHome;

public interface IHomeController {
	
	public DtoHome findHomeById(Long id);
}
