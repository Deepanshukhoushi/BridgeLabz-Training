package Day_1.HackerRank_based_Codebase;

import java.io.*;
import java.util.*;

public class ArrayManipulation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        long[] arr = new long[n + 2]; // difference array

        for (int i = 0; i < m; i++) {
            String[] op = br.readLine().split(" ");
            int a = Integer.parseInt(op[0]);
            int b = Integer.parseInt(op[1]);
            int k = Integer.parseInt(op[2]);

            arr[a] += k;
            arr[b + 1] -= k;
        }

        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
