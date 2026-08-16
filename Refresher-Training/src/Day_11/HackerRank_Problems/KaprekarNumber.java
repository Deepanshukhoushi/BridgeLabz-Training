package Day_11.HackerRank_Problems;

import java.util.Scanner;

public class KaprekarNumber {
    public static void kaprekarNumbers(int p, int q) {
        boolean found = false;
        for (int i = p; i <= q; i++) {
            long sq = (long) i * i;
            String str = String.valueOf(sq);
            int d = String.valueOf(i).length();

            String right = str.substring(Math.max(str.length() - d, 0));
            String left = str.substring(0, Math.max(str.length() - d, 0));

            int r = right.isEmpty() ? 0 : Integer.parseInt(right);
            int l = left.isEmpty() ? 0 : Integer.parseInt(left);

            if (l + r == i) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("INVALID RANGE");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        kaprekarNumbers(input.nextInt(), input.nextInt());

    }
}
