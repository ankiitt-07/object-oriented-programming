import java.util.*;

class Employee {
    
    private String employeeName;
    private int employeeId;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.employeeName = name; 
        this.employeeId = id;    
        this.salary = salary;    
    }

    public void printDetails() {
        System.out.println("--------Employee Details--------");
        System.out.println("Employee name: " + employeeName);
        System.out.println("Employee id: " + employeeId);
        System.out.println("Employee salary: " + salary);
        System.out.println();
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ankit", 1, 250000);
        employee1.printDetails();
        // Employee employee2 = new Employee("Jerry", 2, 280000);
        // employee2.printDetails();
    }
}