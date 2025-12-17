/* 
1. Calculate Simple Interest
Write a program to calculate simple interest using the formula:
Simple Interest = (Principal * Rate * Time) / 100.
Take Principal, Rate, and Time as inputs from the user
*/

import java.util.*;
public class CalculateSimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter principal: ");
	int principal = sc.nextInt();

	System.out.println("Enter rate: ");
	int rate = sc.nextInt();

	System.out.println("Enter time: ");
	int time = sc.nextInt();
	
	int simpleInterest = (principal * rate * time) / 100;
	
	System.out.println("Simple interest is " + simpleInterest);
    }
}