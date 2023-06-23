package com.sujata.employee.client;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
 * scan for all the classes in the mentioned package,
 * and create the object of classes Annotated with either @Component,@Service and @Repository
 */

@ComponentScan(basePackages = "com.sujata.employee") 
public class EmployeeConfiguration {

}
