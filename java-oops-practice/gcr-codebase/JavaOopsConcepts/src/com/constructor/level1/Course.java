package com.constructor.level1;

public class Course {

    private String courseName;
    private int duration;     // duration in months
    private double fee;

    // Class variable (shared by all courses)
    private static String instituteName = "ABC Institute";

    // Parameterized constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " months");
        System.out.println("Fee           : ₹" + fee);
        System.out.println("Institute     : " + instituteName);
        System.out.println();
    }

    // Class (static) method
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}
