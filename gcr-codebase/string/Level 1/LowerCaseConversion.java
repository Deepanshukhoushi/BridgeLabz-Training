import java.util.Scanner;
public class LowerCaseConversion {

    // Method to convert string to lowercase using charAt()
    public static String convertToLowerCaseUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase (A-Z)
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);             }
            result = result + ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter the text: ");
        String text = input.nextLine();

        String customLower = convertToLowerCaseUsingCharAt(text);

        String builtInLower = text.toLowerCase();

        boolean result = compareStringsUsingCharAt(customLower, builtInLower);

        // Display results
        System.out.println("\nLowercase using charAt(): " + customLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);
        System.out.println("Both results are equal: " + result);

        input.close();
    }
}
