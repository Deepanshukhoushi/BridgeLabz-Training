package Day_11.HackerRank_Problems;

import java.util.Scanner;

public class CaesarCipher {
    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        k = k%26;

        for(char c : s.toCharArray()){
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char shifted = (char) ((c - base + k) % 26 + base);
                sb.append(shifted);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(caesarCipher(input.next(), input.nextInt()));
    }
}
