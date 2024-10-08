package com.example.RestAPI_demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestAPI_demo.Exception.EmpNotFoundException;
import com.example.RestAPI_demo.model.Employee;
import com.example.RestAPI_demo.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repo;
	
	
	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee addEmp(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated met/stub
		Optional<Employee> e1 = repo.findById(id);
		return e1.orElseThrow(() -> new EmpNotFoundException("Employee not found with empId : "+id));
//		return Optional.ofNullable(repo.findById(id).orElseThrow(() -> new EmpNotFoundException("Employee Not found in database with id "+id)));
	}

	@Override
	public void updateEmpName(int empId, String name) {
		// TODO Auto-generated method stub
//		Optional<Employee> emp =  repo.findById(empId);
		
		repo.updateName(empId,name);
		
//		return null;
	}

}
