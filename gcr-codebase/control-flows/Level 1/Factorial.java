import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number for factorial: ");
	int num = input.nextInt();
	int result = 1;
	if (num>0){
	    while (num>1){
		result*=num;
		num--;
	    }
	}
	System.out.println("The Factorial is " + result);
    }
}