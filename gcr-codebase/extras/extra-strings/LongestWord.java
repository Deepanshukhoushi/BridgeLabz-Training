import java.util.Scanner;
public class LongestWord {
    static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        return longest;
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a String sentence: ");
	String sentence = input.nextLine();
        System.out.println(findLongestWord(sentence));
    }
}
