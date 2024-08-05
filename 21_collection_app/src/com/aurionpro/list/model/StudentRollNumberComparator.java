package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentRollNumberComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		if(student1.getRollNo()>student2.getRollNo())
			return 0;
		if(student1.getRollNo()<student2.getRollNo())
			return -1;
		return 0;
		
		//return student1.getRollNo()-student2.getRollNo();
		
	}
	
	
	
	

}
