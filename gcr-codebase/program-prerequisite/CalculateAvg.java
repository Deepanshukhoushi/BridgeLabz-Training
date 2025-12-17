/*
. Calculate Average of Three Numbers
Write a program that takes three numbers as input from the user and prints
their average
*/
import java.util.*;
public class CalculateAvg{
    public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int first = sc.nextInt();
	
	System.out.println("Enter second number: ");
	int second = sc.nextInt();

	System.out.println("Enter third number: ");
	int third = sc.nextInt();
	
	int average = (first + second + third)/3;
	
	System.out.println("Average of numbers is " + average);
    }
}