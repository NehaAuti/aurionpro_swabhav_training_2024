package com.aurienpro.test;
import java.util.Scanner;

import com.aurienpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//System.out.println(box);
		Scanner scanner = new Scanner(System.in);
		    
		System.out.println("Enter the Size of Employee:");
		int size = scanner.nextInt();
		Employee employee[]=new Employee[size];
	    for(int i =0;i<employee.length;i++)
		{
	    System.out.println("Enter the Employee Id:");
	    int employeeId=scanner.nextInt();
	   
	    System.out.println("Enter the Name:");
	    String name =scanner.next();
	    
	    System.out.println("Enter the Salary:");
	    int salary=scanner.nextInt();
	    
	    employee[i]=new Employee(employeeId,name,salary);
	    }
	    for(int i=0;i<employee.length;i++)
	    {
	    	employee[i].display();
	    		
	    }

	}

}
