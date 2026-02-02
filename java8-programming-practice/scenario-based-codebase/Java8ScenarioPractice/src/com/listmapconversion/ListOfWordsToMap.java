package com.listmapconversion;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfWordsToMap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of Elements: ");
		int n = input.nextInt();
		List<String> str = new ArrayList<>();
		System.out.println("Enter string: ");
		for(int i = 0; i<n; i++) {
			str.add(input.next());
		}
		
		Map<String, Long> map = str.stream().filter(Objects::nonNull)
				.collect(Collectors.groupingBy(
				w -> w, 
				LinkedHashMap::new,
				Collectors.counting()
				));
		
		System.out.println(map);
		input.close();
	}
}
