// importing Scanner to take user input and creating a class called SumOfNaturalNumbers
import java.util.Scanner;
public class SumOfNaturalNumbers{
    public static void main(String[] args){
	//taking input from user
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	
	//calculating the sum of n natural numbers 
	int total1 = (number*(number+1))/2;
	int total2 = 0;
	
	// calculating the sum of n natural numbers using while loop
	while (number >=0){
	    total2+=number;
	    number--;
	}
	
	//displaying the output if both sum are equal
	if (total1 == total2){
	    System.out.println("Both results matched, the total is " + total1);
	}
    }
}

	
	    