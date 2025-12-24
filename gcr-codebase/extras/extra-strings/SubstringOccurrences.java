import java.util.Scanner;
public class SubstringOccurrences {
    static int countOccurrences(String text, String sub) {
        int count = 0;
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if (text.substring(i, i + sub.length()).equals(sub))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter String: ");
	String text = input.next();
	System.out.println("Enter substring: ");
	String sub = input.next();
        System.out.println(countOccurrences(text, sub));
    }
}
