//importing scanner and creating FactorsUsingWhile class
import java.util.Scanner;
public class FactorsUsingWhile{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	//Taking input from user
	System.out.print("Enter a number: ");
	int number = input.nextInt();
	
	//finding factors using while loop
	if (number <= 0) {
	    System.out.println("Enter a valid number: ");
	} else {
	    int i = 1;
	    
	    while(i<number) {
		if(number%i==0) {
		    System.out.println(i);
		}
		i++;
	    }
	}
	input.close();
    }
}
