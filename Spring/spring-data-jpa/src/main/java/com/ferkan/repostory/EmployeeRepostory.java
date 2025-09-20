package com.ferkan.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferkan.entites.Employee;

public interface EmployeeRepostory extends JpaRepository<Employee, Long>{

	
}
