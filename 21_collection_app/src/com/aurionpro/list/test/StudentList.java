package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Student;
import com.aurionpro.list.model.StudentRollNumberComparator;

public class StudentList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		
//		students.add(new Student(1,"Neha",95));
//		students.add(new Student(2,"Sayali",90));
//		students.add(new Student(3,"Sakshi",85));
//		students.add(new Student(4,"Namrata",80));
		
		
	       StudentList studentList = new StudentList();
	        studentList.readStudents(students, scanner);
	        studentList.printStudentsDetails(students);

	        scanner.close();
	    }

	    private void readStudents(List<Student> students, Scanner scanner) {
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Enter details for student " + (i + 1) + ":");

	            System.out.print("Enter ID: ");
	            int rollNo = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            System.out.print("Enter Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Enter Marks: ");
	            int percentage = scanner.nextInt();

	            students.add(new Student(rollNo, name, percentage));
	        }
	    }

	    private void printStudentsDetails(List<Student> students) {
	        System.out.println("Student List:");
	        for (Student student : students) {
	            System.out.println(student);
	        }
		
//		 System.out.println("Students Not Sorted:");
//	        
//	        for(Student student:students)
//	        	System.out.println(student);
//	        
//	        Collections.sort(students,new StudentRollNumberComparator());
//	        
//	        System.out.println("Students Sorted Roll Number Wise:");
//	        
//	        for(Student student:students)
//	        	System.out.println(student);
//	        
	    }
	}