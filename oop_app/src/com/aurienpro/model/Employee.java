package com.aurienpro.model;

public class Employee {
	
		public int employeeId;
		public String name;
		public int salary;
		
		public Employee(){
			this.employeeId=1;
			this.name="rohit";
			this.salary=20000;
		}
		
		public Employee(int employeeId,String name,int salary){
			this.employeeId=employeeId;
			this.name=name;
			this.salary=salary;
			
		}
		
	public void setEmployeeId(int i)
	{
		employeeId = i;
	}

	public int getEmployeeId()
	{
		return employeeId;
	}

	public void setName(String n)
	{
		name = n;
	}

	public String getName()
	{
		return name;
	}

	public void setSalary(int s)
	{
		salary = s;	
	}

	public int getSalary()
	{
		return salary;
	}

	
	public void display()
	{
		System.out.println("EmployeeId:"+employeeId);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		

	}

	}

