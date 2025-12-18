// importing Scanner class and creating class MultipleBelowHundred
import java.util.Scanner;
public class MultiplesBelowHundred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for positive integer and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive integer less than 100.");
        } else {
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        input.close();
    }
}
