package com.interfaces.listinterface.nthelementfromend;
import java.util.LinkedList;
import java.util.Scanner;

public class NthFromEnd {
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        int slow = 0;
        int fast = 0;

        for (int i = 0; i < n; i++) {
            if (fast >= list.size()) {
                return "N is greater than the list size";
            }
            fast++;
        }

        while (fast < list.size()) {
            slow++;
            fast++;
        }

        return list.get(slow);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextLine());
        }

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        String result = findNthFromEnd(list, n);
        System.out.println("Nth element from end: " + result);

        sc.close();
    }
}
