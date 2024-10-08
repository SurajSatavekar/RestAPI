package com.example.RestAPI_demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestAPI_demo.model.Employee;
import com.example.RestAPI_demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/get")
	public List<Employee> getAll(){
		return service.getAllEmp();
	}
	
	@PostMapping("/add")
	public Employee addEmp(@RequestBody Employee emp) {
		return service.addEmp(emp);
	}
	
	@GetMapping("/get/{id}")
	public Employee getById(@PathVariable int id) {
		return service.getEmpById(id);
	}
	
	@PutMapping("/{id}/name")
	   public ResponseEntity<Void> updateEmployeeName(@PathVariable int id, @RequestParam String name) {
	       service.updateEmpName(id, name);
	       return ResponseEntity.ok().build();
	   }
}
