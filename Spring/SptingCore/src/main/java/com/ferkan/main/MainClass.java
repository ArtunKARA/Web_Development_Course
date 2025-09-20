package com.ferkan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ferkan.config.AppConfig;
import com.ferkan.model.User;
import com.ferkan.services.LoginService;
import com.ferkan.services.UserService;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = applicationContext.getBean(UserService.class);

		for (User user : userService.getUserList()) {
			System.out.println(user.getFirstName());
		}
		
		LoginService loginService = new LoginService();
		loginService.login();
	}

}
