import java.util.Scanner;
public class CheckNumberProperty{
    public static int numProperty(int number){
	if (number < 0){
	    return -1;
	} else if (number> 0) {
	    return 1;
	} else {
	    return 0;
	}
    }
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	//take input
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	
	int property = CheckNumberProperty.numProperty(number);
	System.out.println(property);
    }
}
	