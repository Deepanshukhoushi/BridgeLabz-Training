//importing Scanner class to take input and creating a class VoteOrNot
import java.util.Scanner;
public class VoteOrNot{
    public static void main(String[] args){

	//taking input from user
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the age of person: ");
	int age = input.nextInt();
	
        // conditions to check person is 18+ or not and displaying output accordingly	
	if (age>=18) {
	    System.out.println("The person's age is " + age + " and can vote");
	}else{
	    System.out.println("The person's age is " + age + " and cannot vote");
	}
	input.close();
    }
}