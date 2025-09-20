package com.ferkan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferkan.model.Employee;

@Repository
public interface EmployeeRepostory extends JpaRepository<Employee, Long>{

}
