import java.util.Scanner;
public class FibonacciSequence{
    public static void generateSequence(int num){
	int a = 0, b = 1, c;
	for (int i = 1; i < num; i++){
	    c = a+b;
	    a = b;
	    b = c;
	    System.out.println(a);
	}
    }
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the ending number: ");
	int num = input.nextInt();
	generateSequence(num);
    }
} 
	