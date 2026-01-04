package com.stackandqueue.sortstackusingrecursion;

import java.util.Scanner;
import java.util.Stack;

public class SortStackRecursion {

    // Sort entire stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
    }

    // Insert element in sorted order
    private static void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, value);
        stack.push(top);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        System.out.println("Enter stack elements:");
        for (int i = 0; i < n; i++) {
            stack.push(input.nextInt());
        }

        sortStack(stack);

        System.out.println("\nSorted Stack (Top → Bottom):");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        input.close();
    }
}
