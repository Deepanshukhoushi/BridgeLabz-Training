package com.stackandqueue.queueusingstack;
import java.util.Scanner;

public class QueueUsingStacksDriver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        QueueUsingStacks queue = new QueueUsingStacks();

        int choice;

        do {
            System.out.println("\n--- Queue Using Stacks ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = input.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    try {
                        System.out.println("Dequeued: " + queue.dequeue());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Front element: " + queue.peek());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println(queue.isEmpty() ? "Queue is empty" : "Queue is not empty");
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        input.close();
    }
}
