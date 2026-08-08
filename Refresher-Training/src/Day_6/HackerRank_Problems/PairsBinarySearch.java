package Day_6.HackerRank_Problems;

import java.util.*;

public class PairsBinarySearch {
    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr);
        int count = 0;

        for (int x : arr) {
            if (binarySearch(arr, x + k)) {
                count++;
            }
        }
        return count;
    }

    // Full binary search implementation
    private static boolean binarySearch(List<Integer> arr, int target) {
        int low = 0, high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = arr.get(mid);

            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // size of array
        int k = sc.nextInt();   // difference value

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(pairs(k, arr));
    }
}
