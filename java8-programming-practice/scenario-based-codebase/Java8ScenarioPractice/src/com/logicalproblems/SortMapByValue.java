package com.logicalproblems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValue {
	public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 5);
        map.put("Python", 2);
        map.put("C++", 4);
        map.put("Go", 1);

        Map<String, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));

        System.out.println(result);
    }
}
