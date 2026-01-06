package com.campusconnect;

import java.util.Scanner;

public class CampusConnectApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faculty Input
        System.out.println("Enter Faculty Details:");
        System.out.print("ID: ");
        int fid = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String fname = sc.nextLine();

        System.out.print("Email: ");
        String femail = sc.nextLine();

        System.out.print("Department: ");
        String dept = sc.nextLine();

        Faculty faculty = new Faculty(fid, fname, femail, dept);

        // Course Input
        System.out.print("\nEnter Course Name: ");
        String courseName = sc.nextLine();

        Course course = new Course(courseName, faculty);

        // Student Input
        System.out.println("\nEnter Student Details:");
        System.out.print("ID: ");
        int sid = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String sname = sc.nextLine();

        System.out.print("Email: ");
        String semail = sc.nextLine();

        Student student = new Student(sid, sname, semail);

        // Grades Input
        System.out.print("\nHow many grades to enter? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter grade " + i + ": ");
            student.addGrade(sc.nextInt());
        }

        // Enroll student
        student.enrollCourse(course);

        // Polymorphism
        Person p1 = student;
        Person p2 = faculty;

        p1.printDetails();
        p2.printDetails();
        course.printCourseDetails();

        sc.close();
    }
}

