import java.util.Scanner;
public class NumberFormatExceptionCheck {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not numeric
        int number = Integer.parseInt(text);
        System.out.println("Number is: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Input is not a valid number.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a value: ");
        String text = input.next();

        // Call method to generate exception
        System.out.println("\nGenerating Exception:");
        //generateException(text); 

        // Call method to handle exception
        System.out.println("\nHandling Exception:");
        handleException(text);

        input.close();
    }
}
