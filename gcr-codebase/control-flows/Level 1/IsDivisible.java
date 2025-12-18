// import java Scanner class to take input from user and Create a Class called IsDivisible in order to check the number is divisible by 5 or not
import java.util.Scanner;
public class IsDivisible{
    public static void main(String[] args){
	// take input for a number
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int number = input.nextInt();
	
	//check the number is divisible by 5 or not and display the output
	System.out.println("Is the number " + number + " divisible by 5? " + ((number%5) == 0));
	input.close();
    }
}