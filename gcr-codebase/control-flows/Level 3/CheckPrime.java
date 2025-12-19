import java.util.Scanner;
public class CheckPrime{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number which you want to check for prime: ");
	int number = input.nextInt();
	boolean isPrime = true;
	
	for (int i = 2; i < number; i++){
	    if (number % i == 0){
 		isPrime = false;
		break;
	    }
	}
	if (isPrime == true){
	    System.out.println(number + " is prime");
	} else {
	    System.out.println(number + " is not prime");
	}
	input.close();
    }
}

