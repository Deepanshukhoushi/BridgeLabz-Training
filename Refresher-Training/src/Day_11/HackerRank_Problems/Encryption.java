package Day_11.HackerRank_Problems;

import java.util.*;

public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("\\s", "");
        int L = s.length();

        int rows = (int) Math.floor(Math.sqrt(L));
        int cols = (int) Math.ceil(Math.sqrt(L));
        if (rows * cols < L) {
            rows++;
        }

        StringBuilder result = new StringBuilder();
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                int idx = r * cols + c;
                if (idx < L) {
                    result.append(s.charAt(idx));
                }
            }
            if (c < cols - 1) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}
