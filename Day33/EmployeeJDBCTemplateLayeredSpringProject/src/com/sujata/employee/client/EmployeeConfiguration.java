package com.sujata.employee.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
/*
 * scan for all the classes in the mentioned package,
 * and create the object of classes Annotated with either @Component,@Service and @Repository
 */

@ComponentScan(basePackages = "com.sujata.employee") 
public class EmployeeConfiguration {
	//DriverManagerDataSource is responsible for registering the driver and connecting to Database.
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/wileydi004");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("sujata");
		return driverManagerDataSource;
	}
	
	/*
	 * is responsible for creating the query and execute them as well
	 */
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

}
