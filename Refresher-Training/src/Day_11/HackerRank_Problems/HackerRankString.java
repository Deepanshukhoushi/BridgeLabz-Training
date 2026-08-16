package Day_11.HackerRank_Problems;

import java.util.Scanner;

public class HackerRankString {
    public static String hackerrankInString(String s) {
        String target = "hackerrank";
        int j = 0;
        for (int i = 0; i < s.length() && j < target.length(); i++) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
        }
        return (j == target.length()) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(hackerrankInString(input.next()));
    }
}
