package com.listmapconversion;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapKeyValuesToStrings {
	public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("mango", 5);

        List<String> keyValueList = map.entrySet()
        		.stream()
        		. map(entry -> entry.getKey() + "=" + entry.getValue())
        		. collect(Collectors.toList());

        

        System.out.println("Original Map: " + map);
        System.out.println("List of Key, Value strings: " + keyValueList);
    }
}
