// importing Scanner and creating class PowerUsingWhile
import java.util.Scanner;
public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        int result = 1;
        int counter = 0;

        // While loop till counter equals power
        while (counter < power) {
            result = result * number;
            counter++;
        }
        System.out.println("Result = " + result);
        input.close();
    }
}
