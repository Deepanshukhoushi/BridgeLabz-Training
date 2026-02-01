package com.logicalproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerToString {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40);

        List<String> result = list.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(result);
	}
}
