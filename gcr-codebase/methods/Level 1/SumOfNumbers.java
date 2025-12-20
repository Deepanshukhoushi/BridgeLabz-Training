import java.util.Scanner;
public class SumOfNumbers{
    public static int countTotal(int number){
	int total = 0;
	for (int i = 0; i<=number; i++){
	    total = total + i;
	}
	return total;
    }
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a number: ");	
	int number = input.nextInt();
	
	int totalSum = SumOfNumbers.countTotal(number);
	
	System.out.println("Total of " + number + " natural numbers is " + totalSum);
    }
}