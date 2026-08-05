import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;
    Node tail;

    // Insert at end
    void insert(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Reverse the linked list
    Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }

        return prev;
    }

    // Print list
    void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

public class ReverseLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        System.out.println("Original List:");
        list.print(list.head);

        list.head = list.reverse(list.head);

        System.out.println("\nReversed List:");
        list.print(list.head);

        sc.close();
    }
}