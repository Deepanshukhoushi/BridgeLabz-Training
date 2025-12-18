// importing classs Scanner to take input & Creating class called FizzBuzzWhile
import java.util.Scanner;
public class FizzBuzzWhile{
    public static void main(String[] args){
	// taking input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();
    
	// conditional Statements to check FizzBuzz
        if (number <= 0) {
	System.out.println("Enter a valid positive: ");
        } else {
	    int i = 1;
	    while (i<=number) {
	        if (i % 3 == 0 && i % 5 == 0) {
		    System.out.println("FizzBuzz");
	        } else if (i%3==0) {
		    System.out.println("Fizz");
	        } else if (i%5==0) {
		    System.out.println("Buzz");
	        } else {
		    System.out.println(i);
                }
		i++;
	    }
	}
	input.close();
    }
}
	