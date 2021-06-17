package com.v2soft.kamesh.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v2soft.kamesh.model.Employee;
import com.v2soft.kamesh.repo.EmployeeRepository;
import com.v2soft.kamesh.service.IEmployeeService;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Integer saveEmployee(Employee e) {
		Integer id = repo.save(e).getEmpId();
		return id;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = repo.findAll();
		return list;
	}

	@Override
	public Employee getOneEmployee(Integer id) {
		Optional<Employee> opt = repo.findById(id);
		Employee emp= null;
		if(opt.isPresent()) {
			emp = opt.get();
		}
		return emp;
	}

	@Override
	public void deleteEmployee(Integer id) {
		Employee emp=getOneEmployee(id);
		repo.delete(emp);

	}

}
