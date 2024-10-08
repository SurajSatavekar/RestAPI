package com.example.RestAPI_demo.service;

import java.util.List;
import java.util.Optional;

import com.example.RestAPI_demo.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmp();
	public Employee addEmp(Employee emp);
	public Employee getEmpById(int id);
	public void updateEmpName(int empId,String name);
	
	
}
