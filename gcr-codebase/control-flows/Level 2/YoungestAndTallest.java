// importing class scanner and create class YoungestAndTallest
import java.util.Scanner;
public class YoungestAndTallest{
    public static void main(String[] args){
	
	// taking input from user
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Amar's age: ");
	int amarAge = input.nextInt();

	System.out.println("Enter Akbar's age: ");
	int akbarAge = input.nextInt();

	System.out.println("Enter Anthony's age: ");
	int anthonyAge = input.nextInt();

	System.out.println("Enter Amar's height: ");
	int amarHeight = input.nextInt();

	System.out.println("Enter Akbar's height: ");
	int akbarHeight = input.nextInt();

	System.out.println("Enter Anthony's height: ");
	int anthonyHeight = input.nextInt();

	// using conditions to check youngest and tallest
	if (amarAge < akbarAge && amarAge < anthonyAge) {
	    System.out.println("Amar is youngest");
	} else if (akbarAge < amarAge && akbarAge < anthonyAge) {
	    System.out.println("Akbar is youngest");
	} else {
	    System.out.println("Anthony is youngest");
	}

	if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
	    System.out.println("Amar is tallest");
	} else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
	    System.out.println("Akbar is tallest");
	} else {
	    System.out.println("Anthony is tallest");
	}
	input.close();
   }
} 