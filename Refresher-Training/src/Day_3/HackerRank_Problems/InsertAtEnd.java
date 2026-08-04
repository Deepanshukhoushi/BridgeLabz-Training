package Day_3.HackerRank_Problems;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtEnd {

    // Insert at the beginning (head)
    static Node insertAtHead(Node head, int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }

    // Print Linked List
    static void printList(Node head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null;

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = insertAtHead(head, value);
        }

        System.out.println("Linked List:");

        printList(head);

        sc.close();
    }
}