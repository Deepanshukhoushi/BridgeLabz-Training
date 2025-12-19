import java.util.Scanner;
public class VoteEligibility{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 10 student's ages: ");
	int[] studentsAge = new int[10];
        for (int i = 0; i < 10; i++) {
            studentsAge[i] = input.nextInt();
        }
	for (int i = 0; i<studentsAge.length; i++){
	    if (studentsAge[i] < 0){
		System.out.println("An invalid age");
	    } else if (studentsAge[i] >= 18) {
		System.out.println("The student with the age " + studentsAge[i] + " can vote.");
	    } else {
		System.out.println("The student with the age " + studentsAge[i] + " cannot vote.");
	    }
	}
	input.close();
    }
}
		
