import java.util.Scanner;
public class CheckArmstrong{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	// take input
	System.out.println("Enter a number which you want to check: ");
	int number = input.nextInt();
	int originalNum = number;
	
	// conditions to check armstrong number
	int cubesTotal = 0;
	while (number != 0){
	    int digit = number % 10;
	    cubesTotal = cubesTotal + (digit*digit*digit);
	    number = number/10;
	}
	if (originalNum == cubesTotal){
	    System.out.println("The number is Armstrong");
	} else {
	    System.out.println("not a Armstrong number");
	}
    }
}

	