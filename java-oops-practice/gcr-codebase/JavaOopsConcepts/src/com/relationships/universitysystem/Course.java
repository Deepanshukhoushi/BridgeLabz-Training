package com.relationships.universitysystem;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getProfessorName());
        }

        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getStudentName());
        }
    }
}
