import java.util.Scanner;
public class ChocolateDistribution{
    public static int[] findQuotientAndRemainder(int numberOfChocolates, int numberOfChildren) {
	int quotient = numberOfChocolates / numberOfChildren;
	int remainder = numberOfChocolates % numberOfChildren;
	
        return new int[] {remainder, quotient};
    }
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number of Chocolates: ");
	int numberOfChocolates = input.nextInt();
	System.out.println("Enter number of childrens: ");
	int numberOfChildren = input.nextInt();
	
	int []finalResult = ChocolateDistribution.findQuotientAndRemainder(numberOfChocolates, numberOfChildren);
	System.out.println("Each Children gets " + finalResult[0]);
	System.out.println("The remaining chocolates are " + finalResult[1]);
	
    }
}
	

	