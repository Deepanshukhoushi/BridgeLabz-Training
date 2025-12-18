// import Scanner to take input and creating class FactorsOfNumber
import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args){
	// taking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
    
	// finding factor of number 
        if (number <= 0) {
            System.out.println("Enter a valid positive number: ");
        } else {
	    for(int i = 1; i<number; i++){
	        if (number % i == 0) {
		    System.out.println(i);
	        }
	    }
	}
	input.close();
    }
}
