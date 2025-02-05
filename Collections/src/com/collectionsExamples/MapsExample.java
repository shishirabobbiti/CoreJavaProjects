package com.collectionsExamples;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

class StudentGradingSystem {
    private Map<String, String> grades; // Map to store student grades (Key: Name, Value: Grade)

    // Constructor
    public StudentGradingSystem() {
        grades = new HashMap<>();
    }

    // Add or update a student's grade
    public void addOrUpdateGrade(String studentName, String grade) {
        grades.put(studentName, grade);
        System.out.println("Grade for " + studentName + " has been added/updated to: " + grade);
    }

    // Retrieve a student's grade
    public void getGrade(String studentName) {
        String grade = grades.get(studentName);
        if (grade != null) {
            System.out.println(studentName + "'s grade is: " + grade);
        } else {
            System.out.println(studentName + " is not in the system.");
        }
    }

    // Remove a student's record
    public void removeStudent(String studentName) {
        if (grades.remove(studentName) != null) {
            System.out.println(studentName + "'s record has been removed.");
        } else {
            System.out.println(studentName + " is not in the system.");
        }
    }

    // Display all student grades
    public void displayAllGrades() {
        if (grades.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            System.out.println("Student Grades:");
            for (Map.Entry<String, String> entry : grades.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            
        }
    }

    // Count the total number of students
    public void totalStudents() {
        System.out.println("Total number of students: " + grades.size());
    }
}


public class MapsExample {

	public static void main(String[] args) {
		
		StudentGradingSystem gradingSystem = new StudentGradingSystem();

        // Adding/updating grades
        gradingSystem.addOrUpdateGrade("Alice", "A");
        gradingSystem.addOrUpdateGrade("Bob", "B");
        gradingSystem.addOrUpdateGrade("Charlie", "A");
        gradingSystem.addOrUpdateGrade("Alice", "A+"); // Updating Alice's grade

        // Displaying all grades
        gradingSystem.displayAllGrades();

        // Retrieving grades
        gradingSystem.getGrade("Bob");
        gradingSystem.getGrade("Daisy");

        // Removing a student's record
        gradingSystem.removeStudent("Charlie");
        gradingSystem.displayAllGrades();

        // Counting total students
        gradingSystem.totalStudents();
	}

}
