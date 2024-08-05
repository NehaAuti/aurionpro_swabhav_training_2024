package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.list.model.Employee;
import com.aurionpro.list.model.EmployeeComparator;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(101,"Neha",50000));
		employees.add(new Employee(102,"Sayali",20000));
		employees.add(new Employee(103,"Sakshi",10000));
		employees.add(new Employee(104,"Namrata",15000));
		
		 Collections.sort(employees, new EmployeeComparator.EmployeeIdComparator());
	     System.out.println("Employees Sorted Employee Id Wise:");
	     for (Employee employee : employees)
	          System.out.println(employee);
	        
	        Collections.sort(employees, new EmployeeComparator.EmployeeNameComparator());
	        System.out.println("Employees Sorted Name Wise:");
	        for (Employee employee : employees)
	            System.out.println(employee);
	        
	        Collections.sort(employees, new EmployeeComparator.EmployeeSalaryComparator());
	        System.out.println("Employees Sorted Salary Wise:");
	        for (Employee employee : employees)
	            System.out.println(employee);
	        
	        scanner.close();
	    }
	}