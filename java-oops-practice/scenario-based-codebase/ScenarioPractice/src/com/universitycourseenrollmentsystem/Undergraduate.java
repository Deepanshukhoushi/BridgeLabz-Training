package com.universitycourseenrollmentsystem;

public class Undergraduate extends Student implements Graded {

    public Undergraduate(int studentId, String name) {
        super(studentId, name);
    }

    @Override
    public void assignGrade(double marks) {
        double calculatedGpa;

        if (marks >= 85) {
            calculatedGpa = 4.0;
        } else if (marks >= 70) {
            calculatedGpa = 3.0;
        } else if (marks >= 50) {
            calculatedGpa = 2.0;
        } else {
            calculatedGpa = 0.0;
        }

        setGpa(calculatedGpa);
    }
}
