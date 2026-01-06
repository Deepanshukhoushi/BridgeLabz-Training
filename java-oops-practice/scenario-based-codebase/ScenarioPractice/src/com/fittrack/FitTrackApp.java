package com.fittrack;
import java.util.Scanner;
public class FitTrackApp {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter Name: ");
    	String name = input.next();
    	System.out.println("Enter age: ");
    	int age = input.nextInt();
    	System.out.println("Enter Weight: ");
    	double weight = input.nextDouble();
    	System.out.println("Enter Goal Lose Weight/Gain Weight: ");
    	String goal = input.next();
        UserProfile user = new UserProfile(name, age, weight, goal);

        Workout cardio = new CardioWorkout(30);
        cardio.startWorkout();
        int calories = cardio.calculateCalories();
        cardio.stopWorkout();

        System.out.println("Calories Burned: " + calories);
        System.out.println("Remaining Calories: " + user.calculateProgress(calories));
        input.close();
    }
}
