/*
. Convert Kilometers to Miles
Write a program that takes the distance in kilometers as input from the user
and converts it into miles using the formula:
Miles = Kilometers * 0.621371.
*/

import java.util.*;
public class KmtoMiles{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter distance in Kilometers:");
	double kilometers = sc.nextDouble();
	
	double miles = kilometers * 0.621371;
	
	System.out.println(kilometers + " is equals to " + miles + " miles");
    }
}