import java.util.Scanner;
public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // 2D array to store height, weight, BMI
        // index 0 → height, 1 → weight, 2 → BMI
        double[][] personData = new double[number][3];

        // Array to store weight status
        String[] weightStatus = new String[number];

        // Take input for height and weight
        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            // Height input with validation
            while (true) {
                System.out.print("Enter height (in meters): ");
                double height = input.nextDouble();
                if (height > 0) {
                    personData[i][0] = height;
                    break;
                }
                System.out.println("Invalid height. Enter a positive value.");
            }

            // Weight input with validation
            while (true) {
                System.out.print("Enter weight (in kg): ");
                double weight = input.nextDouble();
                if (weight > 0) {
                    personData[i][1] = weight;
                    break;
                }
                System.out.println("Invalid weight. Enter a positive value.");
            }
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {

            double height = personData[i][0];
            double weight = personData[i][1];

            // BMI calculation
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("Height  Weight  BMI  Status");
        for (int i = 0; i < number; i++) {
            System.out.println(
                    personData[i][0] + "    " +
                    personData[i][1] + "    " +
                    personData[i][2] + "    " +
                    weightStatus[i]
	    );
        }

        input.close();
    }
}
