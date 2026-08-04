package Day_2.HackerRank_Problems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public class TruckTour {
    public static int truckTour(List<List<Integer>> petrolpumps) {
        // Write your code here
        int totalSurplus = 0;
        int currentSurplus = 0;
        int start = 0;

        for (int i = 0; i<petrolpumps.size(); i++){
            int petrol = petrolpumps.get(i).get(0);
            int distance = petrolpumps.get(i).get(1);

            totalSurplus += petrol - distance;
            currentSurplus += petrol - distance;

            if (currentSurplus < 0){
                currentSurplus = 0;
                start = i+1;
            }
        }
        return totalSurplus >= 0 ? start : -1;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> petrolpumps = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                petrolpumps.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.truckTour(petrolpumps);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
