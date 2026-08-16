package Day_11.HackerRank_Problems;

import java.util.Scanner;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        long countInS = s.chars().filter(ch -> ch == 'a').count();
        long fullRepeats = n / s.length();
        long total = fullRepeats * countInS;

        long remainder = n % s.length();
        total += s.substring(0, (int) remainder).chars().filter(ch -> ch == 'a').count();

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        long n = input.nextLong();
        System.out.println("Number of a's " +
                repeatedString(s, n));
    }
}
