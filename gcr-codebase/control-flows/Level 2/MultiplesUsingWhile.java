// Importing Scanner Class and Creating Class MultiplesUsingWhile
import java.util.Scanner;
public class MultiplesUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking for positive integer and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive integer less than 100: ");
        } else {
            int counter = 100;
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
        input.close();
    }
}
