package com.interfaces.listinterface.countfrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElements {
	public static Map<String, Integer> findFrequency(String[] arr){
		Map<String, Integer> frequencyMap = new HashMap<>();
		
		for(String word : arr) {
			frequencyMap.put(word, frequencyMap.getOrDefault(word, 0)+1);
		}
		
		return frequencyMap;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		
		sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");

        String[] arr = sentence.split(" ");
        
        System.out.println("Word Frequency: ");
        System.out.println(findFrequency(arr));
        input.close();
	}
}
