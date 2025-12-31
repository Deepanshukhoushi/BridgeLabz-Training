package com.relationships.universitysystem;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);

        System.out.println(studentName + " enrolled in " + course.getCourseName());
    }

    public void showEnrolledCourses() {
        System.out.println("\nCourses enrolled by " + studentName + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}
