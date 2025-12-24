import java.util.Scanner;
public class ReplaceWord {
    static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (word.equals(oldWord))
                result += newWord + " ";
            else
                result += word + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String sentence = input.nextLine();
	System.out.println("Enter old word: ");
	String oldWord = input.next();
	System.out.println("Enter new word: ");
	String newWord = input.next(); 

        System.out.println(replaceWord(sentence, oldWord, newWord));
    }
}
