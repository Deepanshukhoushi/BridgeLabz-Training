package com.stackandqueue.queueusingstack;
import java.util.Stack;

class QueueUsingStacks {

    private Stack<Integer> inStack = new Stack<>();
    private Stack<Integer> outStack = new Stack<>();

    // Enqueue operation
    public void enqueue(int value) {
        inStack.push(value);
        System.out.println(value + " enqueued successfully.");
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    // Check empty
    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}

