package com.interfaces.setinterface.checksetsequality;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckSetEquality {

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

        boolean isEqual = set1.equals(set2);

        System.out.println("Are both sets equal? :" + isEqual);

        sc.close();
    }
}
