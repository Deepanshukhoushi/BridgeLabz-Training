import java.util.Scanner;
public class LexicographicalCompare {
    static int compareStrings(String s1, String s2) {
        int min = Math.min(s1.length(), s2.length());

        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return s1.charAt(i) - s2.charAt(i);
        }
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first String: ");
	String s1 = input.next();
	System.out.println("Enter second String: ");
	String s2 = input.next();
        int result = compareStrings(s1, s2);
        if (result < 0)
            System.out.println("apple comes before banana");
        else
            System.out.println("banana comes before apple");
    }
}
