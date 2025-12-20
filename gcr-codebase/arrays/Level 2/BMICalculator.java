import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of persons
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        // Arrays to store data
        double[] weight = new double[n];   // in kg
        double[] height = new double[n];   // in meters
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight (kg): ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (m): ");
            height[i] = input.nextDouble();
        }

        // Calculate BMI and determine status
        for (int i = 0; i < n; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display result
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    height[i], weight[i], bmi[i], status[i]);
        }

        input.close();
    }
}
