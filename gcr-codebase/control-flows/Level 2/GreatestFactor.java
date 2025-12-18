// importing class Scanner and Creating class GreatestFactor
import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {

	// Taking input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

	// loop until find the greatestfactor
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {

            if (number % i == 0) {
                greatestFactor = i;
                break;            }
        }
        System.out.println("Greatest factor : " + greatestFactor);

        input.close();
    }
}
