import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args){
	//taking input from user
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	
	//print table
	int[] multi = new int[10];
	for(int i = 0; i< multi.length; i++){
	    multi[i] = number*(i+1);
	}
	for (int i = 0; i< multi.length; i++){
	   System.out.println(number + " * " + (i+1) + " = " + multi[i]);
	}
    }
}
	