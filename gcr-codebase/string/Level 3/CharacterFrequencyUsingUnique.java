import java.util.Scanner;
public class CharacterFrequencyUsingUnique {

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];

        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

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

        // Create exact size array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency using unique characters
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; 

        // Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);

        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(frequency[ch]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[][] frequencyResult = findCharacterFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(frequencyResult[i][0] + "\t\t" + frequencyResult[i][1]);
        }

        input.close();
    }
}
