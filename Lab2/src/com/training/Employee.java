package com.training;

public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, double salary) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>=5000) {	
		this.salary = salary;
		}
		else {
			System.out.println("Invalid Salary");
		}
}
}