package com.constructor.level1;

public class PostgraduateStudent extends Student {

    private String specialization;

    public PostgraduateStudent(int rollNumber, String name,
                               double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Accessing protected member 'name'
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Name : " + name);
        System.out.println("Specialization            : " + specialization);
        System.out.println("CGPA                      : " + getCGPA());
        System.out.println();
    }
}
