import java.util.Scanner;
public class ArrayIndexOutOfBoundsCheck {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing index beyond array length
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        try {
            // Accessing invalid index
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught and handled.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter number of names: ");
        int size = input.nextInt();

        String[] names = new String[size];

        // Take names input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.next();
        }

        // Call method to generate exception
        System.out.println("\nGenerating Exception:");
        // generateException(names); 

        // Call method to handle exception
        System.out.println("\nHandling Exception:");
        handleException(names);

        input.close();
    }
}
