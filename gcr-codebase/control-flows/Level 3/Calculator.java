import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
	Scanner input =new Scanner(System.in);
	System.out.println("Enter first number: ");	
	int number1 = input.nextInt();
	System.out.println("Enter second number: ");
	int number2 = input.nextInt();
	
	System.out.println("Enter the operator: ");
	String operator = input.next();
	
	switch (operator){
	    case "+":
		System.out.println("result = " + (number1 + number2));
		break;
	    case "-":
		System.out.println("result = " + (number1 - number2));
		break;
	    case "*":
		System.out.println("result = " + (number1 * number2));
		break;
	    case "/":
		if (number2 != 0){
		    System.out.println("result = " + (number1 / number2));
		} else {
		    System.out.println("Cannot divide");
		}
	    default:
		System.out.println("cannot do operations");
	}
	input.close();
    }
}
	