import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number: ");
	int firstNumber = sc.nextInt();
	
	System.out.println("Enter second number: ");
	int secondNumber = sc.nextInt();
	System.out.println("Total = " + (firstNumber+secondNumber)); 
    }
}
