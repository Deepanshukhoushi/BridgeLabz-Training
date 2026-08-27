package Practice.arrays;

import java.util.*;
public class ArrayManipulation {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {

        long[] diff = new long[n + 2];

        for (List<Integer> q : queries) {
            int a = q.get(0);
            int b = q.get(1);
            int k = q.get(2);

            diff[a] += k;
            diff[b + 1] -= k;
        }

        long max = 0;
        long current = 0;

        for (int i = 1; i <= n; i++) {
            current += diff[i];

            if (current > max) {
                max = current;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            List<Integer> query = new ArrayList<>();

            query.add(sc.nextInt());
            query.add(sc.nextInt());
            query.add(sc.nextInt());

            queries.add(query);
        }

        long result = arrayManipulation(n, queries);

        System.out.println(result);

        sc.close();
    }
}
