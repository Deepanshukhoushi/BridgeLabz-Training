package com.logicalproblems;

import java.util.LinkedList;
import java.util.List;

public class AStartingStrings {
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("Who is the boss");
		
		long count = list.stream().filter(s -> s.startsWith("a")).count();
		System.out.println(count);
	}
}
