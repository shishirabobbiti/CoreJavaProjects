package com.collections;

import java.util.HashSet;

class EmployeeManagementSystem {
    private HashSet<Integer> employeeIDs; // HashSet to store employee IDs

    // Constructor
    public EmployeeManagementSystem() {
        employeeIDs = new HashSet<>();
    }

    // Add an employee ID
    public void addEmployee(int id) {
        if (employeeIDs.add(id)) {
            System.out.println("Employee ID " + id + " has been added.");
        } else {
            System.out.println("Employee ID " + id + " already exists.");
        }
    }

    // Remove an employee ID
    public void removeEmployee(int id) {
        if (employeeIDs.remove(id)) {
            System.out.println("Employee ID " + id + " has been removed.");
        } else {
            System.out.println("Employee ID " + id + " does not exist.");
        }
    }

    // Check if an employee ID exists
    public void checkEmployee(int id) {
        if (employeeIDs.contains(id)) {
            System.out.println("Employee ID " + id + " exists.");
        } else {
            System.out.println("Employee ID " + id + " does not exist.");
        }
    }

    // View all employee IDs
    public void viewEmployees() {
        if (employeeIDs.isEmpty()) {
            System.out.println("No employee IDs found.");
        } else {
            System.out.println("Employee IDs: " + employeeIDs);
        }
    }

    // Get the total number of employees
    public void totalEmployees() {
        System.out.println("Total number of employees: " + employeeIDs.size());
    }
}

public class HashSetExample {
    public static void main(String[] args) {
        EmployeeManagementSystem managementSystem = new EmployeeManagementSystem();

        // Adding employee IDs
        managementSystem.addEmployee(101);
        managementSystem.addEmployee(102);
        managementSystem.addEmployee(103);
        managementSystem.addEmployee(102); // Duplicate ID

        // Viewing all employee IDs
        managementSystem.viewEmployees();

        // Checking if an employee ID exists
        managementSystem.checkEmployee(103);
        managementSystem.checkEmployee(104);

        // Removing an employee ID
        managementSystem.removeEmployee(101);
        managementSystem.viewEmployees();

        // Total number of employees
        managementSystem.totalEmployees();
    }
}

