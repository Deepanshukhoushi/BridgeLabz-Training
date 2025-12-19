import java.util.Scanner;
public class CountDigits{
    public static void main(String[] args){
	
	// taking input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	
	// conditions to count digits
	int count = 0;
	while (number != 0){
	    number = number/10;
	    count += 1;
	}
	System.out.println("Number of digits are " + count);
    }
}
	    