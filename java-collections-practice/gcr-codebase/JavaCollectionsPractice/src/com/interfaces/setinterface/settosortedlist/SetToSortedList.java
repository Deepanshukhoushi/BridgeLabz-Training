package com.interfaces.setinterface.settosortedlist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SetToSortedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        System.out.println("Sorted List: " + list);

        sc.close();
    }
}
