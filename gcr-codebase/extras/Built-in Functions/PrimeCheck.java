import java.util.Scanner;
public class PrimeCheck{
    public static boolean checkNum(int num){
	for(int i = 2; i< num/2; i++){
	    if (num%i==0){
		return false;
	    } 
	}
	return true;
    }
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = input.nextInt();
	boolean result = checkNum(num);
	System.out.println(result);
    }
}