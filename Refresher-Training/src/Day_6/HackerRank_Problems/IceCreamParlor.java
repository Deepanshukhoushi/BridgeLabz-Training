package Day_6.HackerRank_Problems;

import java.util.*;

class IceCreamParlor {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        // Step 1: Build 2D array [price, index]
        int[][] flavors = new int[arr.size()][2];
        for (int i = 0; i < arr.size(); i++) {
            flavors[i][0] = arr.get(i);   // price
            flavors[i][1] = i + 1;        // original index (1-based)
        }

        // Step 2: Sort by price
        Arrays.sort(flavors, Comparator.comparingInt(a -> a[0]));

        // Step 3: For each flavor, binary search for complement
        for (int i = 0; i < flavors.length; i++) {
            int current = flavors[i][0];
            int remaining = m - current;

            int left = i + 1, right = flavors.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (flavors[mid][0] == remaining) {
                    int idx1 = flavors[i][1];
                    int idx2 = flavors[mid][1];
                    return Arrays.asList(Math.min(idx1, idx2), Math.max(idx1, idx2));
                } else if (flavors[mid][0] < remaining) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return new ArrayList<>();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int m = sc.nextInt(); // budget
            int n = sc.nextInt(); // number of flavors

            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            // Call your function
            List<Integer> result = IceCreamParlor.icecreamParlor(m, arr);

            // Print the indices
            for (int idx : result) {
                System.out.print(idx + " ");
            }
            System.out.println();
        }
    }
}

