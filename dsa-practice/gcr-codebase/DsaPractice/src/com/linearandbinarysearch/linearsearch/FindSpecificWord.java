package com.linearandbinarysearch.linearsearch;
import java.util.Scanner;
public class FindSpecificWord {
	public static String checkString(String[] str, String word){
		for(String sentence : str) {
			if(sentence.contains(word)) return sentence;
			
		}
		return "Not found";
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of sentences: ");
		int count = input.nextInt();
		input.nextLine();
		
		String[] str = new String[count];
		for (int i = 0; i<count; i++) {
			str[i] = input.nextLine();
		}
		System.out.println("Enter word you want to find: ");
		String word = input.next();
		System.out.println("Word >" + word + "< was found in ->\n" + checkString(str, word));
		input.close();
	}
}
