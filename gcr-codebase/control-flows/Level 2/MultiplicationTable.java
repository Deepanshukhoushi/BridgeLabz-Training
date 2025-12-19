// import Scanner and Create Class called MultiplicationTable
import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args){
	
	// Take input from user
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	
	//loop 
	for(int i=6; i <= 9; i++){
	    System.out.println(number + " * " + i + " = " + (number * i));
	}
	input.close();
    }
}