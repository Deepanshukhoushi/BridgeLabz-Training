import java.util.Scanner;
public class IllegalArgumentExceptionCheck {

    // Method to generate IllegalArgumentException
    public static void generateException(String text, int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start index cannot be greater than end index");
        }

        System.out.println(text.substring(start, end));
    }

    // Method to handle IllegalArgumentException and RuntimeException
    public static void handleException(String text, int start, int end) {
        try {
            if (start > end) {
                throw new IllegalArgumentException("Start index cannot be greater than end index");
            }

            System.out.println(text.substring(start, end));

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        // Call method to generate exception
        System.out.println("\nGenerating Exception:");
        // generateException(text, start, end); 

        // Call method to handle exception
        System.out.println("\nHandling Exception:");
        handleException(text, start, end);

        input.close();
    }
}
