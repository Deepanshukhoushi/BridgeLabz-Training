package com.relationships.universitysystem;

import java.util.ArrayList;

public class Professor {

    private String professorName;
    private ArrayList<Course> coursesTeaching;

    public Professor(String professorName) {
        this.professorName = professorName;
        this.coursesTeaching = new ArrayList<>();
    }

    public String getProfessorName() {
        return professorName;
    }

    public void assignProfessor(Course course) {
        coursesTeaching.add(course);
        course.setProfessor(this);

        System.out.println("Professor " + professorName +
                " assigned to " + course.getCourseName());
    }

    public void showTeachingCourses() {
        System.out.println("\nCourses taught by Professor " + professorName + ":");
        for (Course course : coursesTeaching) {
            System.out.println("- " + course.getCourseName());
        }
    }
}
