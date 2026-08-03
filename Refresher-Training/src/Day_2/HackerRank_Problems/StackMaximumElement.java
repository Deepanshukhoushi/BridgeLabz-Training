package Day_2.HackerRank_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class StackMaximumElement {
    public static List<Integer> getMax(List<String> operations) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        for(String op : operations){
            String[] parts = op.split(" ");
            int type = Integer.parseInt(parts[0]);

            if(type == 1){
                int x = Integer.parseInt(parts[1]);
                stack.push(x);
                if(maxStack.isEmpty() || x >= maxStack.peek()){
                    maxStack.push(x);
                }
            } else if (type == 2){
                int removed = stack.pop();
                if (removed == maxStack.peek()){
                    maxStack.pop();
                }
            } else if (type == 3){
                result.add(maxStack.peek());
            }
        }
        return result;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> res = StackMaximumElement.getMax(ops);

        System.out.println((
                res.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        ));

        bufferedReader.close();

    }
}
