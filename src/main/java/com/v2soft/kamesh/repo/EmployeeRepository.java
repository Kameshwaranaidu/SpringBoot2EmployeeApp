package com.v2soft.kamesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v2soft.kamesh.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	

}
