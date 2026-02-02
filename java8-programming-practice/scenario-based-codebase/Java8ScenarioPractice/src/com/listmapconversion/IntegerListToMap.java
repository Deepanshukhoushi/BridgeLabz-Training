package com.listmapconversion;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class IntegerListToMap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of Elements: ");
		int n = input.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter string: ");
		for(int i = 0; i<n; i++) {
			list.add(input.nextInt());
		}
		
		Map<Integer, Integer> map = list.stream()
				.filter(Objects::nonNull)
				.collect(Collectors.toMap(num -> num, num -> num*num,
						(existing, replacement) -> existing, 
						LinkedHashMap::new));
		System.out.println(map);
		input.close();
	}
}
