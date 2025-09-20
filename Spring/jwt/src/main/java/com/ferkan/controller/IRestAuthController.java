package com.ferkan.controller;

import com.ferkan.dto.DtoUser;
import com.ferkan.jwt.AuthRequest;
import com.ferkan.jwt.AuthResponse;

public interface IRestAuthController {

	public DtoUser register(AuthRequest request);
	
	public AuthResponse authenticate(AuthRequest request);
}
