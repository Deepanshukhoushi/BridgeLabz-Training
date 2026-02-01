package com.logicalproblems;

import java.util.*;

public class KthSmallestElement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(7, 10, 4, 3, 20, 15);
        int k = 3;

        int kthSmallest = list.stream()
                .sorted()
                .skip(k - 1)
                .findFirst()
                .get();

        System.out.println(kthSmallest);
    }
}
