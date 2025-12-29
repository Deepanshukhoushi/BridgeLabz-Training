/*
Maya’s BMI Fitness Tracker
Maya is a fitness coach who wants to calculate BMI for her clients.
Write a Java program that takes height and weight as input, calculates BMI using the formula BMI = weight / (height * height), and prints the BMI category as Underweight, Normal, or Overweight using if-else conditions. Use meaningful variable names and proper comments to maintain clean code.
*/

import java.util.Scanner;
public class BmiFitnessTracker {
    public static double calculateBmi(double weightInKg, double heightInMeters) {
	if (heightInMeters <= 0 || weightInKg <= 0) {
    	    System.out.println("Height and weight must be positive values.");
       	    return;
 	}
        return weightInKg / (heightInMeters * heightInMeters);
    }

    public static String getBmiCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else {
            return "Overweight";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input height and weight
        System.out.print("Enter height in meters: ");
        double heightInMeters = input.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double weightInKg = input.nextDouble();

        // Method calls
        double bmi = calculateBmi(weightInKg, heightInMeters);
        String category = getBmiCategory(bmi);

        // Output
        System.out.printf("\nYour BMI is: %.2f%n", bmi);
        System.out.println("BMI Category: " + category);

        input.close();
    }
}
