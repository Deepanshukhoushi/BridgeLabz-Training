package Day_2.HackerRank_Problems;

public class EqualStack {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        int sum1 = h1.stream().mapToInt(Integer::intValue).sum();
        int sum2 = h2.stream().mapToInt(Integer::intValue).sum();
        int sum3 = h3.stream().mapToInt(Integer::intValue).sum();

        int i = 0, j = 0, k = 0;

        while(!(sum1 == sum2 && sum2 == sum3)){
            if(sum1 >= sum2 && sum1 >= sum3){
                sum1 -= h1.get(i++);
            } else if (sum2>=sum1 && sum2 >= sum3){
                sum2 -= h2.get(j++);
            } else {
                sum3 -= h3.get(k++);
            }
        }
        return sum1;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = BalancedBrackets.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
