package com.listmapconversion;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no. of Elements: ");
		int n = input.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter number: ");
		for(int i = 0; i<n; i++) {
			list.add(input.nextInt());
		}
		
		Map<Integer, Integer> map =
		        java.util.stream.IntStream.range(0, list.size())
		                .boxed()
		                .collect(Collectors.toMap(
		                        i -> i,
		                        list::get,
		                        (a, b) -> a,
		                        LinkedHashMap::new
		                ));

		System.out.println(map);
		input.close();
	}
}
