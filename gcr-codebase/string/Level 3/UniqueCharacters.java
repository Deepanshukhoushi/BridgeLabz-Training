import java.util.Scanner;
public class UniqueCharacters {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);

        // Array to store unique characters (max size = length)
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check if already present
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Create new array with exact size
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Call method
        char[] result = findUniqueCharacters(text);

        // Display result
        System.out.print("Unique characters: ");
        for (char ch : result) {
            System.out.print(ch + " ");
        }

        input.close();
    }
}
