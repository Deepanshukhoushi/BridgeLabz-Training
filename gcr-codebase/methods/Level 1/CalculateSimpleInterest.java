// import Scanner class and creating class named CalculateSimpleInterest
import java.util.Scanner;
public class CalculateSimpleInterest{

    // create method CalculateInterest
    public static int CalculateInterest(int principal,int rate,int time){
    	int simpleInterest = principal * rate * time / 100;
        return simpleInterest;
    }

    public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	//take input from user
	System.out.println("Enter a principal amount: ");
	int principal = input.nextInt();
	System.out.println("Enter rate of interest: ");
	int rate = input.nextInt();
	System.out.println("Enter Time: ");
	int time = input.nextInt();

	int interest = CalculateSimpleInterest.CalculateInterest(principal, rate, time);
	
	System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and time " + time + " year");
    }
	
}
