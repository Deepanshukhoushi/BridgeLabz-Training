package com.javagenerics.coursemanagementsystem;

import java.util.Scanner;

public class UniversityCourseSystem {

    private static final Scanner scanner = new Scanner(System.in);
    private static final CourseManager manager = new CourseManager();

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("\n--- University Course Management ---");
            System.out.println("1. Add Course");
            System.out.println("2. Display All Courses");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addCourse();
                case 2 -> manager.displayCourses();
                case 3 -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        scanner.close();
    }

    private static void addCourse() {
        scanner.nextLine(); // clear buffer

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.println("Select Evaluation Type:");
        System.out.println("1. Exam-Based");
        System.out.println("2. Assignment-Based");
        System.out.println("3. Research-Based");
        System.out.print("Choice: ");
        int typeChoice = scanner.nextInt();

        switch (typeChoice) {
            case 1 -> manager.addCourse(
                    new Course<>(courseName, department, new ExamCourse())
            );
            case 2 -> manager.addCourse(
                    new Course<>(courseName, department, new AssignmentCourse())
            );
            case 3 -> manager.addCourse(
                    new Course<>(courseName, department, new ResearchCourse())
            );
            default -> {
                System.out.println("Invalid evaluation type!");
                return;
            }
        }

        System.out.println("Course added successfully!");
    }
}
