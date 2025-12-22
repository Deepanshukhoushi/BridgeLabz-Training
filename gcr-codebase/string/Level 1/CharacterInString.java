import java.util.Scanner;
public class CharacterInString {
    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // User-defined method
        char[] userDefinedArray = getCharacters(input);

        // Built-in method
        char[] builtInArray = input.toCharArray();

        // Compare arrays
        boolean result = compareArrays(userDefinedArray, builtInArray);

        // Display result
        System.out.println("User-defined and built-in results are same: " + result);

        scanner.close();
    }
}


