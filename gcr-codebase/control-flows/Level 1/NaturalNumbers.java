// importing java scanner class to take input from user, and creating a class called NaturalNumbers
import java.util.Scanner;
public class NaturalNumbers{
    public static void main(String[] args){
	
	// taking input from user
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();

	//calculating sum of n natural numbers and using conditions to check the number is natural or not, displaying output
	int sumNums = number * (number + 1) / 2;
	if (number > 0) {
	    System.out.println("The sum of " + number + " natural numbers is " + sumNums); 
	}else{
	    System.out.println("The number " + number + " is not a natural number");
	}
	input.close();
    }
}
