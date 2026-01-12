package com.skillforge;

import java.util.Scanner;
public class SkillForgeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter instructor name: ");
        String instName = sc.nextLine();

        System.out.print("Enter instructor email: ");
        String instEmail = sc.nextLine();

        Instructor instructor = new Instructor(instName, instEmail);

        System.out.print("\nEnter student name: ");
        String stuName = sc.nextLine();

        System.out.print("Enter student email: ");
        String stuEmail = sc.nextLine();

        Student student = new Student(stuName, stuEmail);

        System.out.print("\nEnter course title: ");
        String courseTitle = sc.nextLine();

        System.out.println("Select course level:");
        System.out.println("1. Beginner");
        System.out.println("2. Advanced");
        int choice = sc.nextInt();
        sc.nextLine();

        Course course;

        if (choice == 1) {
            course = new BeginnerCourse(courseTitle, instructor);
        } else {
            System.out.print("Enter number of modules: ");
            int n = sc.nextInt();
            sc.nextLine();

            String[] modules = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter module " + (i + 1) + ": ");
                modules[i] = sc.nextLine();
            }

            course = new AdvancedCourse(courseTitle, instructor, modules);
        }

        System.out.print("\nEnter completed modules: ");
        int completed = sc.nextInt();

        student.updateProgress(completed, course.getTotalModules());

        System.out.print("Enter marks obtained: ");
        int marks = sc.nextInt();
        student.assignMarks(marks);

        System.out.println("\n--- Student Report ---");
        System.out.println("Course: " + course.getTitle());
        System.out.println("Progress: " + student.getProgress() + "%");
        System.out.println("Marks: " + student.getMarks());

        ICertifiable cert = (ICertifiable) course;
        cert.generateCertificate();

        sc.close();
    }
}
