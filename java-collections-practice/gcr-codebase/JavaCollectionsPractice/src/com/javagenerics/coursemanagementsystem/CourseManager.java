package com.javagenerics.coursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

class CourseManager {

    private final List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }

    public boolean isEmpty() {
        return courses.isEmpty();
    }
}
