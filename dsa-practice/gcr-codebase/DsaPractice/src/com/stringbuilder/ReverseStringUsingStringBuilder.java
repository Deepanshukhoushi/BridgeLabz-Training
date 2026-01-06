package com.stringbuilder;
import java.util.Scanner;
public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter a string: ");
        String str = input.next();

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();

        String reversedString = sb.toString();
        System.out.println(reversedString);
        input.close();
    }
}

