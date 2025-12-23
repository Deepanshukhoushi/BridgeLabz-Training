import java.util.Scanner;
public class TrimUsingCharAt {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string with spaces: ");
        String text = input.nextLine();

        int[] indexes = findTrimIndexes(text);
        String customTrimmed = createSubstring(text, indexes[0], indexes[1]);

        String builtInTrimmed = text.trim();

        boolean isEqual = compareStrings(customTrimmed, builtInTrimmed);

        // Display results
        System.out.println("\nCustom Trimmed Text  : \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed Text: \"" + builtInTrimmed + "\"");
        System.out.println("Are both equal?      : " + isEqual);

        input.close();
    }
}
