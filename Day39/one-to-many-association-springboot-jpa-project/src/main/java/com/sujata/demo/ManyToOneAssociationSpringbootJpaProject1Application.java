package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.dto.entity.Employee;
import com.sujata.dto.entity.Project;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.ProjectDao;

@SpringBootApplication
@EntityScan(basePackages = "com.sujata.dto.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class ManyToOneAssociationSpringbootJpaProject1Application implements CommandLineRunner {

	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private ProjectDao projectDao;
	
	public static void main(String[] args) {
		SpringApplication.run(ManyToOneAssociationSpringbootJpaProject1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee e1=new Employee(101, "Akash", "Director", 178000);
		Employee e2=new Employee(102, "Ben", "Manager", 65000);
		Employee e3=new Employee(103, "Charlie", "Associate", 35000);
		Employee e4=new Employee(104, "Derick", "Executive", 17000);
		Employee e5=new Employee(105, "Evan", "VP", 235000);
		Employee e6=new Employee(106, "Faiz", "Sr. Associate", 78000);
		Employee e7=new Employee(107, "Gagan", "Manager", 137000);
		Employee e8=new Employee(108, "Hitesh", "Sr. Executive", 18000);
		Employee e9=new Employee(109, "Ishita", "Sr. Associate", 58000);
		Employee e10=new Employee(110, "Jack", "Associate", 68000);

		Project p1=new Project("P001", "Project AAAA");
		p1.getEmployeeList().add(e2);
		p1.getEmployeeList().add(e7);
		
		Project p2=new Project("P002", "Project BBBB");
		p2.getEmployeeList().add(e3);
		p2.getEmployeeList().add(e10);
		
		Project p3=new Project("P003", "Project CCCC");
		p3.getEmployeeList().add(e1);
		p3.getEmployeeList().add(e4);
		p3.getEmployeeList().add(e5);
		
		Project p4=new Project("P004", "Project DDDD");
		p4.getEmployeeList().add(e6);
		p4.getEmployeeList().add(e8);
		p4.getEmployeeList().add(e9);
		
		
				
		employeeDao.save(e1);
		employeeDao.save(e2);
		employeeDao.save(e3);
		employeeDao.save(e4);
		employeeDao.save(e5);
		employeeDao.save(e6);
		employeeDao.save(e7);
		employeeDao.save(e8);
		employeeDao.save(e9);
		employeeDao.save(e10);
		
		projectDao.save(p1);
		projectDao.save(p2);
		projectDao.save(p3);
		projectDao.save(p4);
		
		
	}

}
