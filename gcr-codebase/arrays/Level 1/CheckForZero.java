import java.util.Scanner;
public class CheckForZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create array and variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (0 or negative number to stop):");

        // Infinite while loop
        while (true) {
            double value = input.nextDouble();
            if (value <= 0) {
                break;
            }
            if (index == 10) {
                break;
            }
            numbers[index] = value;
            index++;
        }
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("Sum of all numbers = " + total);

        input.close();
    }
}
