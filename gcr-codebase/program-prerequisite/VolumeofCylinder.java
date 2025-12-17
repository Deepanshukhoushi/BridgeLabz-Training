/* Volume of a Cylinder
Write a program to calculate the volume of a cylinder. Take the radius and
height as inputs and use the formula:
Volume = π * radius^2 * height
*/

import java.util.*;
public class VolumeofCylinder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius: ");
	double radius = sc.nextDouble();
	System.out.println("Enter height: ");
	double height = sc.nextDouble();
	
	double volume = 3.14 * (radius*radius) *height;
	System.out.println("Volume of Cylinder is " + volume);
    }
}