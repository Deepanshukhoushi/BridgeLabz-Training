package Day_8.HackerRank_Problems;

import java.util.*;

public class CoinChange {
    public static long getWays(int n, List<Long> c) {
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (long coin : c) {
            for (int i = (int) coin; i <= n; i++) {
                dp[i] += dp[i - (int) coin];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First line: n (amount) and m (number of coins)
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Next line: coin denominations
        List<Long> c = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            c.add(sc.nextLong());
        }

        long ways = getWays(n, c);
        System.out.println(ways);

        sc.close();
    }
}
