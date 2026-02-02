package com.listmapconversion;

import java.util.*;
import java.util.stream.Collectors;

public class MapEntriesToList {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("mango", 5);

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        List<Map.Entry<String, Integer>> entryListStream = map.entrySet()
                .stream()
                .collect(Collectors.toList());

        System.out.println("Original Map: " + map);
        System.out.println("Entry List (Constructor): " + entryList);
        System.out.println("Entry List (Stream): " + entryListStream);
    }
}
