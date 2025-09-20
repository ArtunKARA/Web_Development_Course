package com.ferkan.controller;

import com.ferkan.dto.DtoCustomer;

public interface ICustomerControler {
	
	public DtoCustomer findCustomerById(Long id);

}
