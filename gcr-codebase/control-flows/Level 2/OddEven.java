//importing scanner class and Creating Class OddEven
import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
	//taking input from user
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	
	//conditional statements for printing odd or even
	if(number<=0){
	    System.out.println("Enter a valid natural number: ");
	}else{
	    for(int i = 1; i<=number; i++){
		if (i%2 == 0){
		    System.out.println(i + " is an Even number");
		}
		else{
		    System.out.println(i + " is an Odd number");
		}
	    }
	}
    }
}