package Day_3.HackerRank_Problems;

import java.io.*;
import java.util.*;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtHead {

    // Function to insert node at head
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        newNode.next = llist;
        return newNode;
    }

    // Function to print linked list
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of elements to insert
        SinglyLinkedListNode head = null;

        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            head = insertNodeAtHead(head, data);
        }

        printLinkedList(head);
        sc.close();
    }
}
