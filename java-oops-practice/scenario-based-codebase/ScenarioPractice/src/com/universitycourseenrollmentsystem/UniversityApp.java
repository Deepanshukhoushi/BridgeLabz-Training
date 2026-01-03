package com.universitycourseenrollmentsystem;

public class UniversityApp {

    public static void main(String[] args) {

        Student ugStudent = new Undergraduate(101, "Rahul");
        Student pgStudent = new Postgraduate(201, "Anita");

        Course javaCourse = new Course("CS101", "Java Programming");

        Faculty faculty = new Faculty("Dr. Sharma");

        faculty.gradeStudent((Graded) ugStudent, 78);
        faculty.gradeStudent((Graded) pgStudent, 45);

        Enrollment e1 = new Enrollment(ugStudent, javaCourse);
        Enrollment e2 = new Enrollment(pgStudent, javaCourse);

        System.out.println("\n--- Undergraduate Transcript ---");
        e1.showEnrollmentDetails();

        System.out.println("\n--- Postgraduate Transcript ---");
        e2.showEnrollmentDetails();
    }
}
