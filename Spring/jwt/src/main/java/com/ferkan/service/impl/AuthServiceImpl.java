package com.ferkan.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ferkan.dto.DtoUser;
import com.ferkan.jwt.AuthRequest;
import com.ferkan.jwt.AuthResponse;
import com.ferkan.jwt.JwtService;
import com.ferkan.model.User;
import com.ferkan.repository.UserRepostory;
import com.ferkan.service.IAuthService;

@Service
public class AuthServiceImpl implements IAuthService {
	
	@Autowired
	private UserRepostory userRepostory;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtService jwtService;
	
	@Override
	public DtoUser register(AuthRequest request) {
		DtoUser dtoUser = new DtoUser();
		User user = new User();
		
		user.setUsername(request.getUsername());
		user.setPassword(bCryptPasswordEncoder.encode(request.getPassword()));
		
		User savedUser = userRepostory.save(user);
		BeanUtils.copyProperties(savedUser, dtoUser);
		
		return dtoUser;
	}
	

	@Override
	public AuthResponse authenticate(AuthRequest request) {
		try {
			UsernamePasswordAuthenticationToken auth = 
					new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword());
			
			authenticationManager.authenticate(auth);
			Optional<User> optionalUser = userRepostory.findByUsername(request.getUsername());
			String token = jwtService.generateToken(optionalUser.get());
			
			return new AuthResponse(token);
		} catch (Exception e) {
			System.out.println("Kullancı adı şifre hatalı");
		}
		return null;
	}

}
