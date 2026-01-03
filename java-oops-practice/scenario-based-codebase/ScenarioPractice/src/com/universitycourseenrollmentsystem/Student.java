package com.universitycourseenrollmentsystem;

public abstract class Student {

    protected int studentId;
    protected String name;
    private double gpa;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void printTranscript() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name      : " + name);
        System.out.println("GPA       : " + gpa);
    }
}
