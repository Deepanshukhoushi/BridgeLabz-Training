import java.util.Scanner;
public class CharacterFrequency {

    // Method to find character frequencies
    public static Object[][] findCharacterFrequency(String text) {

        int[] frequency = new int[256]; // ASCII characters

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] > 0) {
                uniqueCount++;
                frequency[text.charAt(i)] = -frequency[text.charAt(i)];
            }
        }

        Object[][] result = new Object[uniqueCount][2];

        // Reset frequency array
        for (int i = 0; i < 256; i++) {
            if (frequency[i] < 0) {
                frequency[i] = -frequency[i];
            }
        }

        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] > 0) {
                result[index][0] = ch;
                result[index][1] = frequency[ch];
                index++;
                frequency[ch] = 0; // avoid duplicates
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        Object[][] frequencyResult = findCharacterFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < frequencyResult.length; i++) {
            System.out.println(frequencyResult[i][0] + "\t\t" + frequencyResult[i][1]);
        }

        input.close();
    }
}
