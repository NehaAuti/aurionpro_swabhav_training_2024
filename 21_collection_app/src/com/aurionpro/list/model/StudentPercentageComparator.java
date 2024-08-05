package com.aurionpro.list.model;

import java.util.Comparator;

public class StudentPercentageComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		
		if(student1.getPercentage()>student2.getPercentage())
			return 0;
		if(student1.getPercentage()<student2.getPercentage())
			return -1;
		return 0;
//	return student1.getPercentage()-student2.getPercentage();
	}
	

}