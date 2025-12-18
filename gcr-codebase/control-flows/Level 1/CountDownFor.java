//importing Scanner to take input from user and creating a class called CountDownFor 
import java.util.Scanner;
public class CountDownFor{
    public static void main(String[] args){

	//taking input from user
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the counter number: ");
	int counter = input.nextInt();
	
	// implementing for loop to count from counter to 1
	for (int i = counter; i>0; i--){
	    System.out.println(i);
	}
    }
}
	