package com.example.RestAPI_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.RestAPI_demo.model.Employee;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Modifying
	@Transactional
	@Query("UPDATE Employee e SET e.empName = :name WHERE e.empId = :id")
	void updateName(@Param("id") int empId, @Param("name") String name);
	
}
