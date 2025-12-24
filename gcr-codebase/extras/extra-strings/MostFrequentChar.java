import java.util.Scanner;
public class MostFrequentChar {
    static char mostFrequent(String text) {
        int maxCount = 0;
        char result = text.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j))
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                result = text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String text = input.next();

        System.out.println(mostFrequent(text));
    }
}
