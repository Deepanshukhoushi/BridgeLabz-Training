//importing java collections and creating a class called Calculator
import java.util.*;
public class Calculator{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	double number1 = input.nextDouble();
	double number2 = input.nextDouble();

	// core logics of calculator	
	double addition = number1+number2;
	double substraction = number1-number2;
	double multiplication = number1*number2;
	double division = number1/number2;

	//displaying outputs
	System.out.println("The addition, substraction, multiplication and division value of 2 numbers " + number1 +" and " + number2 + " is " + addition + ", " + substraction + ", " + multiplication + " and " + division);
    }
}  