package Day_2.HackerRank_Problems;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();

        for(int i = 0; i<n; i++){
            int op = sc.nextInt();
            if (op == 1){
                input.push(sc.nextInt());
            } else if (op == 2){
                if (output.empty()){
                    while(!input.empty()){
                        output.push(input.pop());
                    }
                }
                output.pop();
            } else if (op == 3){
                if (output.empty()){
                    while (!input.empty()){
                        output.push(input.pop());
                    }
                }
                System.out.println(output.peek());
            }
        }
        sc.close();
    }
}
