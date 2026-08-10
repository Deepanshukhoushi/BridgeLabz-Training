package Day_7.HackerRank_Problems;

import java.util.Scanner;

public class RecursiveDigitSum {
    public static int superDigit(String n, int k) {

        if (n.length() == 1) {
            return Integer.parseInt(n);
        }

        long sum = 0;

        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }

        sum = sum * k;

        return superDigit(String.valueOf(sum), 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.next();
        int k = input.nextInt();
        System.out.println(superDigit(num, k));
    }
}
