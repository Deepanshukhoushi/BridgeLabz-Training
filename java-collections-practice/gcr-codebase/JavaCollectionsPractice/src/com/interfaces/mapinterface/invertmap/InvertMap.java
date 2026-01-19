package com.interfaces.mapinterface.invertmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class InvertMap {
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> originalMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            invertedMap.putIfAbsent(value, new ArrayList<>());

            invertedMap.get(value).add(key);
        }

        return invertedMap;
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        Map<String, Integer> inputMap = new HashMap<>();
        System.out.println("Enter no. of elements: ");
        int size = input.nextInt();
        
        for(int i = 0; i<size; i++) {
        	System.out.println("Enter Key and Value: ");
        	String key = input.next();
        	int value = input.nextInt();
        	inputMap.put(key, value);
        }

        Map<Integer, List<String>> result = invertMap(inputMap);

        System.out.println("Inverted Map:");
        System.out.println(result);
        input.close();
    }
}
