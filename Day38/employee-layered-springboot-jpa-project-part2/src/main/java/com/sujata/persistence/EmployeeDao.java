package com.sujata.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.dto.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	//SQL : select * from EmployeeJpa where department=?
	@Query("from Employee where department=:depart")
	List<Employee> findEmployeesByDepartment(@Param("depart") String Department);
	
	//SQL : select * from EmployeeJpa where name=?
	@Query("from Employee where empName=:na")
	List<Employee> findEmployeeByName(@Param("na") String name);
	
}
