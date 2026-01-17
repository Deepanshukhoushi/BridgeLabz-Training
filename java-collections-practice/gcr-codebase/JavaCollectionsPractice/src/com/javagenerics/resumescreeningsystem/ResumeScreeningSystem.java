package com.javagenerics.resumescreeningsystem;

import java.util.Scanner;

public class ResumeScreeningSystem {

    private static final Scanner scanner = new Scanner(System.in);
    private static final ScreeningPipeline pipeline = new ScreeningPipeline();

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("\n--- AI Resume Screening System ---");
            System.out.println("1. Add Resume");
            System.out.println("2. Screen All Resumes");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addResume();
                case 2 -> pipeline.screenAllResumes();
                case 3 -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        scanner.close();
    }

    private static void addResume() {
        scanner.nextLine();

        System.out.print("Enter Candidate Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Years of Experience: ");
        int experience = scanner.nextInt();

        System.out.println("Select Job Role:");
        System.out.println("1. Software Engineer");
        System.out.println("2. Data Scientist");
        System.out.println("3. Product Manager");
        System.out.print("Choice: ");
        int roleChoice = scanner.nextInt();

        switch (roleChoice) {
            case 1 -> pipeline.addResume(
                    new Resume<>(name, experience, new SoftwareEngineer()));
            case 2 -> pipeline.addResume(
                    new Resume<>(name, experience, new DataScientist()));
            case 3 -> pipeline.addResume(
                    new Resume<>(name, experience, new ProductManager()));
            default -> {
                System.out.println("Invalid role!");
                return;
            }
        }

        System.out.println("Resume added successfully!");
    }
}
