package com.aurienpro.test;

import java.util.Scanner;


import com.aurienpro.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		System.out.println(student);
		
		System.out.println("Rollno:"+student.getRollno());
	    System.out.println("Name:"+student.getName());
	    System.out.println("Age:"+student.getAge());
	    System.out.println("Percentage:"+student.getPercentage());
	    
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the RollNo:");
	    int rollno=scanner.nextInt();
	   
	    System.out.println("Enter the Name:");
	    String name =scanner.next();
	 
	    System.out.println("Enter the Age:");
	    int age=scanner.nextInt();
	  
	    System.out.println("Enter the Percentage:");
	    double percentage=scanner.nextDouble();
	    
	    
	    System.out.println("Rollno:"+student.getRollno());
	    System.out.println("Name:"+student.getName());
	    System.out.println("Age:"+student.getAge());
	    System.out.println("Percentage:"+student.getPercentage());
	    
	    student.display();
	    
	    Student student1 = new Student(rollno,name,age,percentage);
		
	    
	    System.out.println("Rollno:"+student1.getRollno());
	    System.out.println("Name:"+student1.getName());
	    System.out.println("Age:"+student1.getAge());
	    System.out.println("Percentage:"+student1.getPercentage());
	    
	    student1.display();


	}

}
