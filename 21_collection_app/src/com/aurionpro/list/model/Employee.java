package com.aurionpro.list.model;

public class Employee {
	private int employeeId;
	private String name;
	private int salary;
	public Employee(int employeeId, String name, int salary) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	 @Override
	 public String toString(){
	    return "Employee{Employee Id=" + employeeId + ", Employee Name='" + name + "', Employee Salary=" + salary + "}";
	 }

	

}
