import java.util.Scanner;
public class MaximumOfThree{
    public static int findMax(int first, int second, int third){
	if(first> second && first > third){
	    return first;
	} else if (second > first && second > third){
	    return second;
	} else {
	    return third;
	}
    }
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int first = input.nextInt();
	System.out.println("Enter second number: ");
	int second = input.nextInt();
	System.out.println("Enter third number: ");
	int third = input.nextInt();
	int maximum = findMax(first, second, third);
	System.out.println("The maximum value in three number is " + maximum);
    }
}