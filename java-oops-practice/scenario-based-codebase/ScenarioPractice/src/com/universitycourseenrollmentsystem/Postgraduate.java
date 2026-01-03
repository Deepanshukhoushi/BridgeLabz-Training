package com.universitycourseenrollmentsystem;

public class Postgraduate extends Student implements Graded {

    public Postgraduate(int studentId, String name) {
        super(studentId, name);
    }

    @Override
    public void assignGrade(double marks) {
        double calculatedGpa = (marks >= 50) ? 4.0 : 0.0;
        setGpa(calculatedGpa);
    }
}
