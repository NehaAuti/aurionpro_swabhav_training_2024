package com.aurionpro.list.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Student;
import com.aurionpro.list.model.StudentComparator;
import com.aurionpro.list.model.StudentNameComparator;
import com.aurionpro.list.model.StudentPercentageComparator;
import com.aurionpro.list.model.StudentRollNumberComparator;
public class Student1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1,"Neha",95));
		students.add(new Student(2,"Sayali",90));
		students.add(new Student(3,"Sakshi",85));
		students.add(new Student(4,"Namrata",80));
		
		 System.out.println("Students Not Sorted With Roll No:");
		 for(Student student:students)
			 System.out.println(student);
//	        
//     Collections.sort(students,new StudentRollNumberComparator());  
//	     System.out.println("Students Not Sorted With Name:");
//	     for (Student student : students)
//	          System.out.println(student);   
	        
//	     Collections.sort(students, new StudentNameComparator());
//	     System.out.println("Students Sorted Name Wise:");
//	     for (Student student : students)
//	          System.out.println(student);
	        
	        
	        
         System.out.println("Students Not Sorted With Percentage:");
	     for(Student student:students)
	         System.out.println(student);
	        
//	     Collections.sort(students,new StudentPercentageComparator());
//	     System.out.println("Students Sorted Percentage Wise:");
//	     for(Student student:students)
//	         System.out.println(student);
	     
	     
	     Collections.sort(students,new StudentComparator.StudentRollNumberComparator());
	     System.out.println("Students Sorted Roll Number Wise:");
	     for(Student student:students)
	    	 System.out.println(student);
	     
	     Collections.sort(students,new StudentComparator.StudentNameComparator());
	     System.out.println("Students Sorted Name Wise:");
	     for(Student student:students)
	    	 System.out.println(student);
	     
	     Collections.sort(students,new StudentComparator.StudentPercentageComparator());
	     System.out.println("Students Sorted Percentage Wise:");
	     for(Student student:students)
	    	 System.out.println(student);
	        
	}

}
