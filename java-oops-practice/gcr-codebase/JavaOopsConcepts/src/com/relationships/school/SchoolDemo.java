package com.relationships.school;

public class SchoolDemo {

    public static void main(String[] args) {

        // Create School
        School school = new School("Green Valley School");

        // Create Students
        Student s1 = new Student("Amit");
        Student s2 = new Student("Riya");

        // Create Courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        // Aggregation: School -> Students
        school.addStudent(s1);
        school.addStudent(s2);

        // Association: Student <-> Course
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);

        // Output
        school.showStudents();
        System.out.println();

        s1.viewCourses();
        System.out.println();

        c2.showEnrolledStudents();
    }
}