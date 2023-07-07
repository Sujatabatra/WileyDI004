package com.sujata.model.persistence;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.dto.entity.Employee;

@Transactional
@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	@Modifying
	@Query("update Employee set empSalary=empSalary+:inc where empId=:id" )
	int updateSalaryByEmpId(@Param("id") int empId,@Param("inc") double increment);
}
