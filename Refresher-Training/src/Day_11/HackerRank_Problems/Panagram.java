package Day_11.HackerRank_Problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
    public static String pangrams(String s) {
        s = s.toLowerCase();
        Set<Character> letters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }
        return (letters.size() == 26) ? "pangram" : "not pangram";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(pangrams(input));
        sc.close();
    }
}
