import java.util.Scanner;
public class UpperCaseConversion {

    // Method to convert string to uppercase using charAt()
    public static String convertToUpperCaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase (a-z)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);            }
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

        String customUpper = convertToUpperCaseUsingCharAt(text);

        String builtInUpper = text.toUpperCase();

        boolean result = compareStringsUsingCharAt(customUpper, builtInUpper);

        // Display results
        System.out.println("\nUppercase using charAt(): " + customUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Both results are equal: " + result);

        input.close();
    }
}
