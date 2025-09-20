package com.ferkan.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ferkan.model.Employee;

@Configuration
public class AppConfig {

	
	@Bean
	public List<Employee> employeeList(){
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("1","Abidin","Kaya"));
		employeeList.add(new Employee("2","Memed","Valvala"));
		employeeList.add(new Employee("3","Bilal","Bombastikses"));
		employeeList.add(new Employee("4","Kemalettin","Tornacı"));
		employeeList.add(new Employee("5","Hasan","Kayvan"));
		employeeList.add(new Employee("6","Hasan","Velvele"));

		return employeeList;
	}
}
