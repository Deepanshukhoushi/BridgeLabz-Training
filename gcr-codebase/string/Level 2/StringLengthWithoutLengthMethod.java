import java.util.Scanner;
public class StringLengthWithoutLengthMethod {

    // User-defined method to find length using charAt() and exception handling
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {          
                text.charAt(count); 
                count++;            
            }
        } catch (StringIndexOutOfBoundsException e) {
            // exception occurs when index exceeds string length
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.next();

        int customLength = findStringLength(text);

        int builtInLength = text.length();

        // Display results
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        input.close();
    }
}
