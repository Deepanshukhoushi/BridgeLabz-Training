package com.stackandqueue.stockspanproblem;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

    public static int[] calculateSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Pop while current price is higher or equal
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = input.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter stock prices:");

        for (int i = 0; i < n; i++) {
            prices[i] = input.nextInt();
        }

        int[] span = calculateSpan(prices);

        System.out.println("\nStock Spans:");
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }

        input.close();
    }
}
