package com.ferkan.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ferkan.model.User;
import com.ferkan.services.UserService;

@Configuration
public class AppConfig {
	
	
	//RestControler, Repository, Service (streotype anatasyonu)
	@Bean
	public UserService userService() {
		UserService userService1 = new UserService();

		List<User> userList = new ArrayList<>();
		userList.add(new User("Abidin"));
		userList.add(new User("Hamdi"));

		userService1.setUserList(userList);
		
		return userService1;
	}
}
