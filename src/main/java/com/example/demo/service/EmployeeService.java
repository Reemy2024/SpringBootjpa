package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Employee;
import com.example.demo.repo.EmployeeRepo;
@Service
public class EmployeeService {
@Autowired
	EmployeeRepo repo;
	
//insert an employee

public Employee insert(Employee e) {
	return repo.save(e);
}


//retrieve all records 

public List<Employee> getall(){
	return repo.findAll();
}
	
}
