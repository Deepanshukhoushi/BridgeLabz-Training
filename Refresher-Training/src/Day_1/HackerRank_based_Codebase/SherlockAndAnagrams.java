package Day_1.HackerRank_based_Codebase;

import java.io.*;
import java.util.*;
import java.util.stream.*;

class SherlockAndAnagrams {
    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int sherlockAndAnagrams(String s) {
        Map<String, Integer> freq = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                char[] chars = s.substring(i, j).toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                freq.put(key, freq.getOrDefault(key, 0) + 1);
            }
        }

        int result = 0;
        for (int f : freq.values()) {
            result += f * (f - 1) / 2;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 0; i < q; i++) {
            String s = bufferedReader.readLine();
            int result = SherlockAndAnagrams.sherlockAndAnagrams(s);
            System.out.println(result);
        }

        bufferedReader.close();
    }
}
