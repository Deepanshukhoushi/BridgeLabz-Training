/*
3. Power Calculation
Write a program that takes two numbers as input: a base and an exponent,
and prints the result of base raised to the exponent (without using loops or
conditionals)
*/

import java.util.*;
public class PowerCalculation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter base number: ");
	double base = sc.nextDouble();
	
	System.out.println("Enter exponent number: ");
	double exponent = sc.nextDouble();

	double answer = Math.pow(base, exponent);
	System.out.println("Base^Exponent = " + answer);
    }
}