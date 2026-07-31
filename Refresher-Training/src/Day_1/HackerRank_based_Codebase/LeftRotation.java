package Day_1.HackerRank_based_Codebase;

import java.io.*;
        import java.util.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.toList;

public class LeftRotation {
    /*
     * Rotate the array to the left by d positions
     */
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            ans.add(a.get((i + d) % a.size()));
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().trim().split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = rotLeft(a, d);

        // Print result directly to console
        System.out.println(
                result.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" "))
        );

        bufferedReader.close();
    }
}
