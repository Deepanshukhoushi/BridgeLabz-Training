package com.logicalproblems;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurrencesOfWord {
	public static void main(String[] args) {

        String sentence = "Java is very powerful and Java is fast";

        Map<String, Long> map = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(map);
    }
}
