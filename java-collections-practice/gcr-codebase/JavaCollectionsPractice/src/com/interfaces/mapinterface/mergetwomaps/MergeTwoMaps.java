package com.interfaces.mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MergeTwoMaps {
    public static Map<String, Integer> mergeMaps(
            Map<String, Integer> map1,
            Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return result;
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        Map<String, Integer> map1 = new HashMap<>();
        System.out.println("Enter no. of elements in 1st Map: ");
        int size = input.nextInt();
        
        for(int i = 0; i<size; i++) {
        	System.out.println("Enter Key and Value: ");
        	String key = input.next();
        	int value = input.nextInt();
        	map1.put(key, value);
        }
        

        Map<String, Integer> map2 = new HashMap<>();
        System.out.println("Enter no. of elements in 2nd Map: ");
        int size2 = input.nextInt();
        
        for(int i = 0; i<size2; i++) {
        	System.out.println("Enter Key and Value: ");
        	String key = input.next();
        	int value = input.nextInt();
        	map2.put(key, value);
        }

        Map<String, Integer> mergedMap = mergeMaps(map1, map2);

        System.out.println("Merged Map:");
        System.out.println(mergedMap);
        input.close();
    }
}
