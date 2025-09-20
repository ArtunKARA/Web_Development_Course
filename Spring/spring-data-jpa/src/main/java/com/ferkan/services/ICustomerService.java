package com.ferkan.services;

import com.ferkan.dto.DtoCustomer;

public interface ICustomerService {
	
	public DtoCustomer findCustomerById(Long id);
}
