package com.collections;

import java.util.LinkedHashSet;

class CourseRegistrationSystem {
    private LinkedHashSet<String> registrations; // LinkedHashSet to store student registrations

    // Constructor
    public CourseRegistrationSystem() {
        registrations = new LinkedHashSet<>();
    }

    // Register a student
    public void registerStudent(String studentName) {
        if (registrations.add(studentName)) {
            System.out.println(studentName + " has been registered successfully.");
        } else {
            System.out.println(studentName + " is already registered.");
        }
    }

    // Remove a student registration
    public void removeStudent(String studentName) {
        if (registrations.remove(studentName)) {
            System.out.println(studentName + "'s registration has been removed.");
        } else {
            System.out.println(studentName + " is not registered.");
        }
    }

    // Check if a student is registered
    public void checkStudent(String studentName) {
        if (registrations.contains(studentName)) {
            System.out.println(studentName + " is registered for the course.");
        } else {
            System.out.println(studentName + " is not registered for the course.");
        }
    }

    // View all registered students
    public void viewRegistrations() {
        if (registrations.isEmpty()) {
            System.out.println("No students have registered for the course yet.");
        } else {
            System.out.println("Registered students (in order of registration): " + registrations);
        }
    }

    // Get the total number of registrations
    public void totalRegistrations() {
        System.out.println("Total number of registrations: " + registrations.size());
    }
}

public class LinkedHashSetExample {
    public static void main(String[] args) {
        CourseRegistrationSystem registrationSystem = new CourseRegistrationSystem();

        // Registering students
        registrationSystem.registerStudent("Alice");
        registrationSystem.registerStudent("Bob");
        registrationSystem.registerStudent("Charlie");
        registrationSystem.registerStudent("Alice"); // Duplicate registration

        // Viewing all registrations
        registrationSystem.viewRegistrations();

        // Checking if a student is registered
        registrationSystem.checkStudent("Bob");
        registrationSystem.checkStudent("Daisy");

        // Removing a student
        registrationSystem.removeStudent("Charlie");
        registrationSystem.viewRegistrations();

        // Viewing the total number of registrations
        registrationSystem.totalRegistrations();
    }
}

