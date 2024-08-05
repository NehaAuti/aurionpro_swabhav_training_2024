package com.aurienpro.model;

public class Student {
	public int rollno;
	public String name;
	public int age;
	public double percentage;
	
	public Student(){
		this.rollno = 1;
		this.name = "neha";
		this.age = 20;
		this.percentage = 90;
		
		
	}
	public Student(int rollno , String name,int age,double percentage){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
		
		
	}

public void setRollno(int rollno)
{
	this.rollno = rollno;
}

public int getRollno()
{
	return this.rollno;
}

public void setName(String name)
{
	this.name = name;
}

public String getName()
{
	return this.name;
}

public void setAge(int age)
{
	this.age = age;	
}

public int getAge()
{
	return this.age;
}

public void setPercentage(double percentage)
{
	this.percentage = percentage;	
}

public double getPercentage()
{
	return this.percentage;
}

public void display()
{
	System.out.println("RollNo:"+rollno);
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Percentage:"+percentage);

}

}

