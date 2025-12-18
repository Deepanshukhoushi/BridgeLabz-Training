//importing Scanner class to take input and created class called FactorialUsingFor
import java.util.Scanner;
public class FactorialUsingFor{
    public static void main(String[] args){
		
	//taking input from user
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number for factorial: ");
	int num = input.nextInt();
	
	//calculating result
	int result = 1;
	if (num>0){
	    for (int i = num; i>1; i--){
		result*=i;
	    }
	}
	System.out.println("The Factorial is " + result);
    }
}