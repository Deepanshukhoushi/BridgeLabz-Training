package com.logicalproblems;

import java.util.*;
import java.util.stream.Collectors;

public class JoinStringWithComma {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Java", "is", "very", "powerful"
        );

        String result = list.stream()
                .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
