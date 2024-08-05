package com.aurionpro.structural.composite.model;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private long empId;
    private String position;
    private List<Employee> subordinates;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.name = name;
        this.position = position;
        subordinates = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        subordinates.add(employee);
    }

    public void removeEmployee(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId + " " + name + " - " + position);
        for (Employee e : subordinates) {
            e.showEmployeeDetails();
        }
    }
}
