package Day_11.HackerRank_Problems;

import java.util.*;

public class TwoCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }

        int maxLength = 0;
        List<Character> chars = new ArrayList<>(uniqueChars);

        for (int i = 0; i < chars.size(); i++) {
            for (int j = i + 1; j < chars.size(); j++) {
                char a = chars.get(i);
                char b = chars.get(j);

                int length = 0;
                char prev = '\0';
                boolean valid = true;

                for (char c : s.toCharArray()) {
                    if (c == a || c == b) {
                        if (c == prev) {
                            valid = false;
                            break;
                        }
                        prev = c;
                        length++;
                    }
                }

                if (valid) {
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        System.out.println(maxLength);
    }
}
