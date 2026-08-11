package Day_8.HackerRank_Problems;

import java.util.*;

public class StringPermutation {

    static void permutation(
            String current,
            String remain,
            List<String> result) {

        if (remain.length() == 0) {
            result.add(current);
            return;
        }

        for (int i = 0; i < remain.length(); i++) {
            char ch = remain.charAt(i);

            String newRemain =
                    remain.substring(0, i)
                            + remain.substring(i + 1);

            permutation(
                    current + ch,
                    newRemain,
                    result);
        }
    }

    public static void main(String[] args) {

        List<String> result = new ArrayList<>();

        permutation("", "ABC", result);

        System.out.println(result);
    }
}
