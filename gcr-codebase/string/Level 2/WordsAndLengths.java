import java.util.Scanner;
public class WordsAndLengths {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop counting
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {
        int length = findLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len); // convert length to String
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        String[] words = splitText(text);

        String[][] data = wordsWithLength(words);

        // Display result in tabular format
        System.out.println("\nWord\t\tLength");

        for (int i = 0; i < data.length; i++) {
            int length = Integer.parseInt(data[i][1]); // String → int
            System.out.println(data[i][0] + "\t\t" + length);
        }

        input.close();
    }
}
