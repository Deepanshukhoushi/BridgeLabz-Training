package Day_11.HackerRank_Problems;

import java.util.*;

public class SuperReducedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); // remove adjacent pair
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Empty String");
        } else {
            StringBuilder result = new StringBuilder();
            for (char c : stack) {
                result.append(c);
            }
            System.out.println(result.toString());
        }
    }
}
