package Day_4.HackerRank_Problems;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class BubbleSortSwapCount {

    public static void countSwaps(List<Integer> a) {
        int count = 0;
        int n = a.size();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    // swap
                    int temp = a.get(j);
                    a.set(j, a.get(j + 1));
                    a.set(j + 1, temp);
                    count++;
                }
            }
        }

        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Result.countSwaps(a);

        bufferedReader.close();
    }
}
