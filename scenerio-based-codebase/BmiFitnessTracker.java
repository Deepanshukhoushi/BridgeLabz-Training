import java.util.Scanner;
public class BmiFitnessTracker {
    public static double calculateBmi(double weightInKg, double heightInMeters) {
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
        System.out.println("\nYour BMI is: " + bmi);
        System.out.println("BMI Category: " + category);

        input.close();
    }
}
