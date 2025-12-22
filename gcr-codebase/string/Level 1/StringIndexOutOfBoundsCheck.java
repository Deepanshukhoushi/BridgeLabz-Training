import java.util.Scanner;
public class StringIndexOutOfBoundsCheck {

    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); 
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            // Accessing invalid index
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught and handled.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.println("\nGenerating Exception:");
        // generateException(text);   

        System.out.println("\nHandling Exception:");
        handleException(text);

        input.close();
    }
}
