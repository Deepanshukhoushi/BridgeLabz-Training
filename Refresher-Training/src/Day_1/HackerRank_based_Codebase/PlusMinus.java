package Day_1.HackerRank_based_Codebase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int neg = 0;
        int pos = 0;
        int zero = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                neg++;
            } else if (arr.get(i) > 0) {
                pos++;
            } else {
                zero++;
            }
        }

        double negRatio = (double) neg / arr.size();
        double posRatio = (double) pos / arr.size();
        double zeroRatio = (double) zero / arr.size();

        System.out.printf("%.6f%n", posRatio);
        System.out.printf("%.6f%n", negRatio);
        System.out.printf("%.6f%n", zeroRatio);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().trim().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        PlusMinus.plusMinus(arr);

        bufferedReader.close();
    }
}
