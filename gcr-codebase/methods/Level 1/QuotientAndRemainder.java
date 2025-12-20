import java.util.Scanner;
public class QuotientAndRemainder{
    public static int[] findRemainderAndQuotient(int number, int divisor) {
	int remainder = number % divisor;
	int quotient = number / divisor;
	
        return new int[] {remainder, quotient};
    }
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number: ");
	int number = input.nextInt();
	System.out.println("Enter divisor: ");
	int divisor = input.nextInt();
	
	int []finalResult = QuotientAndRemainder.findRemainderAndQuotient(number, divisor);
	System.out.println("The remainder is " + finalResult[0]);
	System.out.println("The quotient is " + finalResult[1]);
	
	
    }
}
	

	