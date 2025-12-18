// import Scanner class and Create class GreatestFactorWhile
import java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

	// finding factor using counter and while loop
        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;            
	    }
            counter--;
        }
        System.out.println("Greatest factor : " + greatestFactor);

        input.close();
    }
}
