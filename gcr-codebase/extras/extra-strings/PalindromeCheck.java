import java.util.Scanner;
public class PalindromeCheck {
    static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String text = input.next();

        System.out.println(isPalindrome(text));
    }
}
