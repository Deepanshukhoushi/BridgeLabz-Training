package com.relationships.universitysystem;

public class UniversityDemo {

    public static void main(String[] args) {

        // Create University
        University university = new University("Global Tech University");

        // Create Students
        Student s1 = new Student("Amit");
        Student s2 = new Student("Riya");

        // Create Professors
        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Mehta");

        // Create Courses
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");

        // Aggregation
        university.addStudent(s1);
        university.addStudent(s2);
        university.addProfessor(p1);
        university.addProfessor(p2);
        university.addCourse(c1);
        university.addCourse(c2);

        // Communication
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s2.enrollCourse(c2);

        p1.assignProfessor(c1);
        p2.assignProfessor(c2);

        // Display
        s2.showEnrolledCourses();
        p1.showTeachingCourses();
        c1.showCourseDetails();
    }
}
