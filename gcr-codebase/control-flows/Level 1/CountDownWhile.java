//importing Scanner to take input from user and creating a class called CountDownWhile
import java.util.Scanner;
public class CountDownWhile{
    public static void main(String[] args){
	//taking input from user
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the counter number: ");
	int counter = input.nextInt();
	
	// implementing count down using while loop
	while (counter>0){
	    System.out.println(counter);
	    counter--;
	}
	input.close();
    }
}
	