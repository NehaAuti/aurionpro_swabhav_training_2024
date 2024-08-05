package com.aurienpro.model;

public class Rectangle {
	public int length;
	public int breadth;
	public int result;
	
	public Rectangle() {
		this.length = 10;
		this.breadth = 20;
	}
	public Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void initialize(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void display()
	{
		System.out.println("Length:"+this.length);
		System.out.println("Breadth:"+this.breadth);
	}
	public void calculateBoxArea()
	{
		result=this.length*this.breadth; 
		
	}
	public void displayresult()
	{
		System.out.println("Area:"+result);
	}
	

}
