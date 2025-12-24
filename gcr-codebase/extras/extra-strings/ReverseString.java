import java.util.Scanner;
public class ReverseString {
    static String reverse(String text) {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String text = input.next();
        System.out.println(reverse(text));
    }
}
