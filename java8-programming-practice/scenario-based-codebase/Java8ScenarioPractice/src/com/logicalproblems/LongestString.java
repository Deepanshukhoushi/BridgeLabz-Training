package com.logicalproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {
	public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Java", "is", "very", "powerful", "AI"
        );

        String longest = list.stream()
                .max(Comparator.comparingInt(String::length))
                .get();

        System.out.println(longest);
    }
}
