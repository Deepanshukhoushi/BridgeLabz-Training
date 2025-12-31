package com.relationships.university;

import java.util.ArrayList;

public class University {

    private String universityName;

    // Composition
    private ArrayList<Department> departments;

    // Aggregation
    private ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition method
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Aggregation method
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (Department dept : departments) {
            System.out.println("- " + dept.getDepartmentName());
        }
    }

    public void showFaculties() {
        System.out.println("Faculties in " + universityName + ":");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getFacultyName());
        }
    }
}