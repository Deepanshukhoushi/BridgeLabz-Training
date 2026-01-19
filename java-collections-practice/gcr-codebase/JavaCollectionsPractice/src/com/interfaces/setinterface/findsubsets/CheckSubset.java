package com.interfaces.setinterface.findsubsets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        System.out.print("Enter number of elements in Set 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        System.out.print("Enter number of elements in Set 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        boolean isSubset = set2.containsAll(set1);

        System.out.println("Is Set1 a subset of Set2 : " + isSubset);

        sc.close();
    }
}

