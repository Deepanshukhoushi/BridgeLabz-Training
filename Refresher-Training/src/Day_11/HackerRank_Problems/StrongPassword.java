package Day_11.HackerRank_Problems;
import java.util.*;

public class StrongPassword {
    public static int minimumNumber(int n, String password) {
        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()-+";

        int missing = 0;

        if (!password.chars().anyMatch(ch -> numbers.indexOf(ch) >= 0)) missing++;
        if (!password.chars().anyMatch(ch -> lowerCase.indexOf(ch) >= 0)) missing++;
        if (!password.chars().anyMatch(ch -> upperCase.indexOf(ch) >= 0)) missing++;
        if (!password.chars().anyMatch(ch -> specialCharacters.indexOf(ch) >= 0)) missing++;

        return Math.max(missing, 6 - n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(minimumNumber(input.nextInt(), input.next()));
    }
}
