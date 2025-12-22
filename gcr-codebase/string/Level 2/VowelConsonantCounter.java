import java.util.Scanner;
public class VowelConsonantCounter {

    // Method to check whether a character is Vowel, Consonant, or Not a Letter
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // ASCII difference
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to count vowels and consonants using charAt()
    public static int[] findVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        int[] count = findVowelsAndConsonants(text);

        // Display result
        System.out.println("\nNumber of Vowels     : " + count[0]);
        System.out.println("Number of Consonants : " + count[1]);

        input.close();
    }
}
