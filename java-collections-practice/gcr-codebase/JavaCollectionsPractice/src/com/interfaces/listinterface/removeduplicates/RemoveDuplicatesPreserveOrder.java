package com.interfaces.listinterface.removeduplicates;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesPreserveOrder {

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> uniqueSet = new LinkedHashSet<>(list);
        return new ArrayList<>(uniqueSet);
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

        List<Integer> result = removeDuplicates(list);

        System.out.println("List after removing duplicates:");
        System.out.println(result);

        sc.close();
    }
}

