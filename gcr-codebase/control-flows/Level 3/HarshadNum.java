import java.util.Scanner;
public class HarshadNum{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	//taking input 
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	int num = number;
	int sum = 0;
	
	// loop and conditions to find its harshad number or not 
	while (number!=0){
	    sum = sum + (number % 10);
	    number = number/10;
	}
	if ((num % sum)==0){
	    System.out.println("Harshad number");
	} else {
	    System.out.println("Not a Harshad Number");
	}
    }
}
	
	