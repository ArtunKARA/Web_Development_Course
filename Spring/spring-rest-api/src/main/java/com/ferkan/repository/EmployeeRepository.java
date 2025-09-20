package com.ferkan.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ferkan.model.Employee;
import com.ferkan.model.UpdateEmployeeRequest;

@Repository
public class EmployeeRepository {


	@Autowired
	private List<Employee> employeeList;


	public List<Employee> getAllEmployeeList() {
		return employeeList;
	}

	public Employee getEmployeeById(String Id) {
		Employee findEmployee = null;

		for (Employee employee : employeeList) {
			if (Id.equals(employee.getId())) {
				findEmployee = employee;
				break;
			}
		}

		return findEmployee;

	}

	public List<Employee> getEmployeeWithParams(String firstName, String lastName) {
		List<Employee> employeeWithParams = new ArrayList<>();

		if (firstName==null && lastName==null) {
			return employeeList;
		}
		
		for (Employee employee : employeeList) {
			if (firstName!=null && lastName!=null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName) && employee.getFirstName().equalsIgnoreCase(lastName)) {
					employeeWithParams.add(employee);
				}
			}
			if (firstName!=null && lastName==null) {
				if (employee.getFirstName().equalsIgnoreCase(firstName)) {
					employeeWithParams.add(employee);
				}
			}
			if (firstName==null && lastName!=null) {
				if (employee.getFirstName().equalsIgnoreCase(lastName)) {
					employeeWithParams.add(employee);
				}
			}
		}
		
		return employeeWithParams;
	}
	
	public Employee saveEmployee(Employee newEmployee) {
		employeeList.add(newEmployee);
		return newEmployee;
	}
	
	public Boolean deleteEmployee(String id) {
		for (Employee employee : employeeList) {
			if (employee.getId().equalsIgnoreCase(id)) {
				employeeList.remove(employee);
				return true;
			}
		}
		return false;
	}
	
	private Employee findEmployeeByID(String id) {
		Employee findEmployee = null;
		for (Employee employee : employeeList) {
			if (id.equals(employee.getId())) {
				findEmployee = employee;
				break;
			}
		}
		return findEmployee;
	}
	
	public Employee updateEmployee(String id, UpdateEmployeeRequest request) {
		Employee findEmployee = findEmployeeByID(id);
		if (findEmployee != null) {
			deleteEmployee(id);
			
			Employee updatedEmployee = new Employee();
			updatedEmployee.setId(id);
			updatedEmployee.setFirstName(request.getFirstName());
			updatedEmployee.setLastName(request.getLastName());
			
			employeeList.add(updatedEmployee);
			
			return updatedEmployee;
		}
		return null;
	}
}
