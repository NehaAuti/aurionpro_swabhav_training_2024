package com.aurionpro.structural.composite.test;

import com.aurionpro.structural.composite.model.Developer;
import com.aurionpro.structural.composite.model.Manager;

public class CompositePatternTest {

	public static void main(String[] args) {
		 Developer dev1 = new Developer(100, "John Doe", "Senior Developer");
	        Developer dev2 = new Developer(101, "Jane Doe", "Developer");

	        Manager manager1 = new Manager(200, "Alice Smith", "Project Manager");
	        manager1.addEmployee(dev1);
	        manager1.addEmployee(dev2);

	        Developer dev3 = new Developer(102, "James Johnson", "Developer");

	        Manager manager2 = new Manager(201, "Bob Brown", "Senior Manager");
	        manager2.addEmployee(manager1);
	        manager2.addEmployee(dev3);

	        System.out.println("Organization structure before removing an employee:");
	        manager2.showEmployeeDetails();

	        // Remove an employee
	        manager1.removeEmployee(dev2);

	        System.out.println("\nOrganization structure after removing an employee:");
	        manager2.showEmployeeDetails();
	    }
	}