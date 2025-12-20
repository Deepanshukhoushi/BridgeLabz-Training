import java.util.Scanner;
public class MaxHandshakes{
    
    public static int getMaxHandshakes(int numberOfStudents){
	int combinations = (numberOfStudents * (numberOfStudents - 1)) / 2;
        return combinations;
    }

    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number of students: ");
	int numberOfStudents = input.nextInt();
	
	int totalHandshakes = MaxHandshakes.getMaxHandshakes(numberOfStudents);
	System.out.println("The number of possible handshakes amoung students is " + totalHandshakes);

    }
}