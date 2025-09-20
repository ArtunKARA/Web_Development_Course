package com.ferkan.services;

import com.ferkan.dto.DtoHome;

public interface IHomeService {
	
	public DtoHome findHomeById(Long id);
}
