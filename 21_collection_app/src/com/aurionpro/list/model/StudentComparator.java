package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentComparator {
	public static class StudentRollNumberComparator implements Comparator<Student>{
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub

		return student1.getRollNo()-student2.getRollNo();		
	}
}
	
	public static class StudentNameComparator implements Comparator<Student>{

		@Override
		public int compare(Student s1, Student s2) {
	        return s1.getName().compareTo(s2.getName());
	    }	
	}
	
	
	public static class StudentPercentageComparator implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			
			if(student1.getPercentage()>student2.getPercentage())
				return 0;
			if(student1.getPercentage()<student2.getPercentage())
				return -1;
			return 0;
//			return student1.getPercentage()-student2.getPercentage();
		}
		

	}
}
