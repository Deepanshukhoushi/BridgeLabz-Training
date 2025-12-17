/*
2. Perimeter of a Rectangle
Write a program to calculate the perimeter of a rectangle. Take the length
and width as inputs and use the formula:
Perimeter = 2 * (length + width).
*/

import java.util.*;
public class PeriOfRactangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter length: ");
	int length = sc.nextInt();
	System.out.println("Enter width: ");
	int width = sc.nextInt();
	
	int perimeter = 2 * (length + width);
	
	System.out.println("perimeter of rectangle is " + perimeter);
    }
}