import java.util.Scanner;
public class BMICalculator {

    // Method to calculate BMI and Status
    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            String status;

            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Method to display BMI details in tabular format
    public static void displayBMIReport(String[][] report) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");

        for (int i = 0; i < report.length; i++) {
            System.out.printf("%s\t\t%s\t\t%s\t\t%s\n",
                    report[i][0],
                    report[i][1],
                    report[i][2],
                    report[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] personData = new double[10][2];

        // Taking user input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            personData[i][0] = input.nextDouble();

            System.out.print("Height (cm): ");
            personData[i][1] = input.nextDouble();
        }

        // Calling methods
        String[][] bmiReport = calculateBMIAndStatus(personData);
        displayBMIReport(bmiReport);

        input.close();
    }
}
