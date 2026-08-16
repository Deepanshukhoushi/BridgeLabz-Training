package Day_11.HackerRank_Problems;

import java.util.Scanner;

public class BiggerIsGreater {
    public static String biggerIsGreater(String w) {
        char[] arr = w.toCharArray();
        int n = arr.length;

        // Step 1: find pivot
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i < 0) return "no answer"; // already largest permutation

        // Step 2: find successor
        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        // Step 3: swap pivot and successor
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        // Step 4: reverse suffix
        for (int l = i + 1, r = n - 1; l < r; l++, r--) {
            char t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String w = sc.next();
            System.out.println(biggerIsGreater(w));
        }
        sc.close();
    }
}
