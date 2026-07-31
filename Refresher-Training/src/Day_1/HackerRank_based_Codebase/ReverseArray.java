package Day_1.HackerRank_based_Codebase;

import java.io.*;
        import java.util.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.toList;

public class ReverseArray {
    /*
     * Reverse the array and return it
     */
    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            reversed.add(a.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> res = reverseArray(arr);

        // Print result directly to console
        System.out.println(
                res.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
        );

        bufferedReader.close();
    }
}
