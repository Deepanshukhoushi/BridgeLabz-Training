//import Scanner and Creating class PowerOfNumber 
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Checking for positive integers
        if (number <= 0 || power < 0) {
            System.out.println("Please enter valid positive integers.");
        } else {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }
            System.out.println("Result = " + result);
        }
        input.close();
    }
}
