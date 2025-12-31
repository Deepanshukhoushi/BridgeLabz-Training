package com.relationships.university;

public class UniversityDemo {

    public static void main(String[] args) {

        // Faculty exists independently (Aggregation)
        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        // Create University
        University university = new University("Global Tech University");

        // Composition: Departments belong to University
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        // Aggregation: Faculty added to University
        university.addFaculty(f1);
        university.addFaculty(f2);

        // Display
        university.showDepartments();
        System.out.println();
        university.showFaculties();

        // Delete University
        university = null;

        System.out.println("\nUniversity deleted!");

        // Faculty still exists
        System.out.println("Faculty still exists independently:");
        System.out.println(f1.getFacultyName());
        System.out.println(f2.getFacultyName());
    }
}
