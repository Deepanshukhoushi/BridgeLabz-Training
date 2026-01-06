package com.campusconnect;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements ICourseActions {

    private List<Integer> grades;   // private → encapsulation
    private List<Course> courses;

    public Student(int id, String name, String email) {
        super(id, name, email);
        grades = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int total = 0;
        for (int g : grades) {
            total += g;
        }
        return (double) total / grades.size();
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    @Override
    public void printDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID    : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Email : " + email);
        System.out.println("GPA   : " + calculateGPA());
    }
}
