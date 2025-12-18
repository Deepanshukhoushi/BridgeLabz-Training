// importing java scanner class to take input from user and creating SmallestOfThree class to check the first number is smallest of three
import java.util.Scanner;
public class SmallestOfThree{
    public static void main(String[] args){

	// taking input from user
	Scanner input = new Scanner(System.in);
	System.out.println("Enter First number: ");
	int number1 = input.nextInt();
	System.out.println("Enter Second number: ");
	int number2 = input.nextInt();
	System.out.println("Enter Third number: ");
	int number3 = input.nextInt();
	
	// applying conditions to check if the first number is smallest of three and displaying output
	System.out.println("Is the first number the smallest? " + ((number1 < number2) && (number1 < number3)));
    }
}