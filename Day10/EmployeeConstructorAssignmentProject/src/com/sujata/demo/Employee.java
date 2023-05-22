package com.sujata.demo;

public class Employee {

	private String empName;
	private int empId;
	private int empAge;
	private String empdesgn;
	private String empLocation;
	private double empExpInYrs;

//	1.Employee  name alone
	public Employee(String empName) {
		this.empName = empName;
	}

//	2. Employee name and id

	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
//	3. Employee name, id and age

	public Employee(String empName, int empId, int empAge) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
	}

//	4. Employee name, id and designation
	public Employee(String empName, int empId, String empdesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
	}

// 5. Employee name, id, age and designation
	public Employee(String empName, int empId, int empAge, String empdesgn) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = empdesgn;
	}

//	6. Employee name, id, age and location
	public Employee(String empName, int empId, String empLocation, int empAge) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empLocation = empLocation;
	}

//	7. Employee name, id, age and experience
	public Employee(String empName, int empId, int empAge, double empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empExpInYrs = empExpInYrs;
	}

//	8. Employee name, id, designation and experience
	public Employee(String empName, int empId, String empdesgn, double empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
		this.empExpInYrs = empExpInYrs;
	}

//	9. Employee name, id, designation, location and experience
	public Employee(String empName, int empId, String empdesgn, String empLocation, double empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}

	// 10. Employee name, id, age, designation, location and experience
	public Employee(String empName, int empId, int empAge, String empdesgn, String empLocation, double empExpInYrs) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}
}
