package com.constructor.level1;

public class UniversityMain {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 8.2);
        s1.displayStudentDetails();

        // Modify CGPA using public setter
        s1.setCGPA(8.6);
        System.out.println("Updated CGPA: " + s1.getCGPA());
        System.out.println();

        PostgraduateStudent pg =
                new PostgraduateStudent(201, "Anita", 9.1, "Computer Science");
        pg.displayPostgraduateDetails();
    }
}
