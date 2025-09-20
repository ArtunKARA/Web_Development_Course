package com.ferkan.service;

import com.ferkan.dto.DtoUser;
import com.ferkan.jwt.AuthRequest;
import com.ferkan.jwt.AuthResponse;

public interface IAuthService {

	public DtoUser register(AuthRequest request);
	
	public AuthResponse authenticate(AuthRequest request);
	
}
