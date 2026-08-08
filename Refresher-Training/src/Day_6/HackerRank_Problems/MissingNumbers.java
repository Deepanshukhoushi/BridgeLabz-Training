package Day_6.HackerRank_Problems;

import java.util.*;
import java.util.stream.Collectors;

public class MissingNumbers {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {

        Collections.sort(arr);
        Collections.sort(brr);

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr.size() && j < brr.size()) {

            if (Objects.equals(arr.get(i), brr.get(j))) {
                i++;
                j++;
            } else {
                result.add(brr.get(j));
                j++;
            }
        }

        while (j < brr.size()) {
            result.add(brr.get(j));
            j++;
        }

        return result.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of arr: ");
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter arr elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.print("Enter size of brr: ");
        int m = sc.nextInt();

        List<Integer> brr = new ArrayList<>();

        System.out.println("Enter brr elements:");
        for (int i = 0; i < m; i++) {
            brr.add(sc.nextInt());
        }

        List<Integer> result = missingNumbers(arr, brr);

        System.out.println("Missing numbers: " + result);

        sc.close();
    }
}