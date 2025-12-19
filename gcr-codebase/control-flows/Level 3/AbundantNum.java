import java.util.Scanner;
public class AbundantNum{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number which you want to check: ");
	int number = input.nextInt();
	int sum = 0;
	for (int i = 1; i<number; i++){
	    if (number%i==0){
		sum += i;
	    } 
	}
	if (sum > number){
	    System.out.println("Abundant Number");
	} else {
	    System.out.println("Not an abundant number");
	}
    }
}