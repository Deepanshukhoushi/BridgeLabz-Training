package com.javagenerics.coursemanagementsystem;

class Course<T extends CourseType> {

    private final String courseName;
    private final String department;
    private final T courseType;

    public Course(String courseName, String department, T courseType) {
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "Course: " + courseName +
               " | Department: " + department +
               " | Evaluation: " + courseType.getEvaluationMethod();
    }
}
