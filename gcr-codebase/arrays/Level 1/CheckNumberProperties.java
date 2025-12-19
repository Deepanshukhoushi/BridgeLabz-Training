import java.util.Scanner;
public class CheckNumberProperties{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 5 numbers: ");
	int[] numbers = new int[5];
	
	for(int i = 0; i < numbers.length; i++){
	    numbers[i] = input.nextInt();
	}
	
	for(int i = 0; i < numbers.length; i++) {
	    if (numbers[i] > 0){
		if (numbers[i] % 2 == 0){
		    System.out.println("Even number");
		} else {
		    System.out.println("Odd number");
		}
	    } else if (numbers[i] < 0) {
	        System.out.println("Negative");
	    } else {
		System.out.println("Zero");
	    }
	}
	if (numbers[0] > numbers[numbers.length-1]){
	    System.out.println("First element is greater");
	} else if (numbers[0] < numbers[numbers.length-1]){
	    System.out.println("First element is Less");
	} else {
	    System.out.println("First and last elements are Equal");
	}   
    }
}