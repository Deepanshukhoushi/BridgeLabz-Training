package com.logicalproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLength {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Java", "is", "Very", "powerful");
		
		List<Integer> lengths = list.stream().map(String::length).collect(Collectors.toList());
		
		System.out.println("Words are: " + list);
		System.out.println("Lengths are: " + lengths);
		
	}
}
