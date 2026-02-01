package com.logicalproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
	public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 3, 3);

        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toList());

        System.out.println(duplicates);
    }
}
