import java.util.Scanner;
public class FindSmallestAndLargest{
    public static int smallestNumber(int number1, int number2, int number3){
	if ((number1 < number2) && (number1< number3)){
	    return number1;
	} else if ((number2<number1) && (number2 < number3)){
 	    return number2;
	} else {
	    return number3;
	}
    }
    public static int largestNumber(int number1, int number2, int number3){
	if ((number1 > number2) && (number1 > number3)){
	    return number1;
	} else if ((number2 > number1) && (number2 > number3)){
 	    return number2;
	} else {
	    return number3;
	}
    } 

    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int number1 = input.nextInt();
	System.out.println("Enter second number: ");
	int number2 = input.nextInt();
	System.out.println("Enter third number: ");
	int number3 = input.nextInt();

	
	int smallest = FindSmallestAndLargest.smallestNumber(number1, number2, number3);
	int largest = FindSmallestAndLargest.largestNumber(number1, number2, number3);
	
	System.out.println("Smallest = " + smallest);
	System.out.println("Largest = " + largest);
    }
}
	