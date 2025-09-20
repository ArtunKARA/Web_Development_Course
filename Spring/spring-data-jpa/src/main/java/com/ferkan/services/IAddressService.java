package com.ferkan.services;

import com.ferkan.dto.DtoAddress;

public interface IAddressService {
	
	public DtoAddress findAddresById(Long id);
	
}
