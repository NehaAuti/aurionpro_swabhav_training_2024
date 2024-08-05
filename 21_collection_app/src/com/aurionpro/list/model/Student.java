package com.aurionpro.list.model;

public class Student {
	public int rollNo;
	public String name;
	public double percentage;
	public Student(int rollNo, String name, double percentage) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	 @Override
	 public String toString(){
	    return "Student{rollNo=" + rollNo + ", name='" + name + "', percentage=" + percentage + "}";
	 }
	
}
