import java.util.Scanner;
public class FirstNonRepeatingCharacter {

    // Method to find first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256]; 

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        return '\0';
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        input.close();
    }
}
