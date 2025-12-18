//importing java scanner class and creating LargestNumber class to check largest number
import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args){

	// Taking input from user 
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int number1 = input.nextInt();
	System.out.println("Enter second number: ");
	int number2 = input.nextInt();
	System.out.println("Enter third number: ");
	int number3 = input.nextInt();
	
	// checking conditions to find the largest number and displaying output
	System.out.println("Is the first number the largest? " + ((number1 > number2) && (number1 > number3)));
	System.out.println("Is the second number the largest? " + ((number2 > number1) && (number2 > number3)));
	System.out.println("Is the third number the largest? " + ((number3 > number1) && (number3 > number2)));
    	
	input.close();
    }
}


