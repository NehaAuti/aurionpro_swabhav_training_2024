package com.aurionpro.model;


public class Student {
	
	
	public Student(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}

	private IStudentService studentService;
	
	public double calculatePercentage()

	{
		return (studentService.getMarks()/studentService.getNumberOfSubjects());
		
	}
	
	
}
