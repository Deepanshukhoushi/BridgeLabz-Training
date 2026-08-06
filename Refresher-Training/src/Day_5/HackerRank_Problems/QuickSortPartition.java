package Day_5.HackerRank_Problems;

import java.util.List;

public class QuickSortPartition {
    public static List<Integer> quickSort(List<Integer> arr) {
        int pivot = arr.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.add(pivot);
        result.addAll(right);
        return result;
    }
}
