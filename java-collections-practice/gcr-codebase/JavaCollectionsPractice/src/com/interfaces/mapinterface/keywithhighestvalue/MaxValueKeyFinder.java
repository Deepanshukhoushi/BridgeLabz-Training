package com.interfaces.mapinterface.keywithhighestvalue;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxValueKeyFinder {
    public static String findKeyWithMaxValue(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        System.out.println("Enter no. of elements: ");
        int size = input.nextInt();
        
        for(int i = 0; i<size; i++) {
        	System.out.println("Enter Key and Value: ");
        	String key = input.next();
        	int value = input.nextInt();
        	map.put(key, value);
        }

        String result = findKeyWithMaxValue(map);
        System.out.println("Key with highest value: " + result);
        input.close();
    }
}
