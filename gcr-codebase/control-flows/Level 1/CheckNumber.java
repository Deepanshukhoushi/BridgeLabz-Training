//importing Scanner class for input, creating class called CheckNumber
import java.util.Scanner;
public class CheckNumber{
    public static void main(String[] args){
	// Taking input
        Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	
	//Conditions for checking the number is positive, negative or zero
	if (number>0) {
	    System.out.println("Positive");
	} 
	else if (number < 0){
	    System.out.println("Negative");
	} 
	else {
	    System.out.println("Zero");
	}
	input.close();
    }
}
