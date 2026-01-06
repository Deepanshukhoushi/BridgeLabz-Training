package com.campusconnect;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private Faculty faculty;
    private List<Student> students;

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void printCourseDetails() {
        System.out.println("\n--- Course Details ---");
        System.out.println("Course Name : " + courseName);
        System.out.println("Faculty     : " + faculty.name);
        System.out.println("Total Students Enrolled : " + students.size());
    }
}
