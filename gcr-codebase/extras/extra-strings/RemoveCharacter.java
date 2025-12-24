import java.util.Scanner;
public class RemoveCharacter {
    static String removeChar(String text, char ch) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ch)
                result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String text = input.next();
	System.out.println("Enter a character: ");
	char ch = input.next().charAt(0);
        System.out.println(removeChar(text, ch));
    }
}
