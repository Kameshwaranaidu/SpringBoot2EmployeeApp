package com.v2soft.kamesh.service;

import java.util.List;

import com.v2soft.kamesh.model.Employee;

public interface IEmployeeService {
	Integer saveEmployee(Employee e);
	List<Employee>getAllEmployee();
	
	Employee getOneEmployee(Integer id);
	
	void deleteEmployee(Integer id);

}
