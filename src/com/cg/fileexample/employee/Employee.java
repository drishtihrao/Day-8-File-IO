package com.cg.fileexample.employee;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private String employeeName;
	private int employeeId;
	private long salary;
	//creating a constructor for the class Employee
	public Employee(String employeeName, int employeeId, long salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	//getters and setters for the instance members of the class Employee
	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public long getSalary() {
		return salary;
	}

	//Displaying employee details
	@Override
	public String toString() {
		return "Employee with employeeName = " + employeeName + ", employeeId = " + employeeId + ", salary = " + salary + ".";
	}

}