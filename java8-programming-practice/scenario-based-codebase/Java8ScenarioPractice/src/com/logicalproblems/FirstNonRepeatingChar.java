package com.logicalproblems;

import java.util.Scanner;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		Character ch = str.chars()
		        .mapToObj(c -> (char) c)
		        .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
		        .findFirst()
		        .orElse(null);

		System.out.println(ch);
		input.close();
	}
}
