import java.util.Scanner;
public class ShortestAndLongestWord {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop
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
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    // Method to find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] data) {
        int shortestIndex = 0;
        int longestIndex = 0;

        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {
            int length = Integer.parseInt(data[i][1]);

            if (length < min) {
                min = length;
                shortestIndex = i;
            }

            if (length > max) {
                max = length;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input text
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        // Call methods
        String[] words = splitText(text);
        String[][] data = wordsWithLength(words);
        int[] result = findShortestAndLongest(data);

        // Display all words with length
        System.out.println("\nWord\t\tLength");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + Integer.parseInt(data[i][1]));
        }

        // Display shortest and longest words
        System.out.println("\nShortest word: " + data[result[0]][0]);
        System.out.println("Longest word : " + data[result[1]][0]);

        input.close();
    }
}
