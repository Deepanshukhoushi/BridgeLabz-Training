package com.javagenerics.mealplangenerator;

import java.util.Scanner;

public class MealPlanSystem {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("\n--- Personalized Meal Plan Generator ---");
            System.out.println("1. Generate Meal Plan");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> generateMealPlan();
                case 2 -> System.out.println("Goodbye! Stay healthy 💪");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 2);

        scanner.close();
    }

    private static void generateMealPlan() {
        scanner.nextLine(); 

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.println("Choose Meal Type:");
        System.out.println("1. Vegetarian");
        System.out.println("2. Vegan");
        System.out.println("3. Keto");
        System.out.println("4. High Protein");
        System.out.print("Choice: ");
        int mealChoice = scanner.nextInt();

        Meal<? extends MealPlan> meal;

        switch (mealChoice) {
            case 1 -> meal = MealGenerator.generateMeal(name, new VegetarianMeal());
            case 2 -> meal = MealGenerator.generateMeal(name, new VeganMeal());
            case 3 -> meal = MealGenerator.generateMeal(name, new KetoMeal());
            case 4 -> meal = MealGenerator.generateMeal(name, new HighProteinMeal());
            default -> {
                System.out.println("Invalid meal selection!");
                return;
            }
        }

        System.out.println("\n--- Your Personalized Meal Plan ---");
        System.out.println(meal);
    }
}
