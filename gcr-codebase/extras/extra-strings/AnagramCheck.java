import java.util.Scanner;
public class AnagramCheck {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int f : freq)
            if (f != 0) return false;

        return true;
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first String: ");
	String s1 = input.next();
	System.out.println("Enter second String: ");
	String s2 = input.next();

        System.out.println(isAnagram(s1, s2));
    }
}
