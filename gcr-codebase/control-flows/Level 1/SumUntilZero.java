//importing scanner class for 
import java.util.Scanner;
public class SumUntilZero{
    public static void main(String[] args){
	//Taking input from user
	Scanner input = new Scanner(System.in);
	double total = 0.0;
	System.out.println("Enter a value: ");
	double number = input.nextDouble();

	//loop while the user enter 0 and displaying the output 
	while (number > 0){
	    if (number!=0){
		System.out.println("Enter the value again: ");
	    }
	    total+=number;
	    number = input.nextDouble();
	}
	System.out.println("Entered 0 and the total value is " + total);
    }
}
