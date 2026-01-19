package com.interfaces.listinterface.rotatelistelements;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateList {

    private static void reverse(List<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void rotateLeft(List<Integer> list, int k) {
        int n = list.size();
        k = k % n;

        reverse(list, 0, k - 1);
        reverse(list, k, n - 1);
        reverse(list, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Rotate by positions: ");
        int k = sc.nextInt();

        rotateLeft(list, k);

        System.out.println("Rotated List: " + list);
        sc.close();
    }
}

