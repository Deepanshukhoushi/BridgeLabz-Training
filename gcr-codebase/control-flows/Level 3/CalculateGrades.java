// create class CalculateGrades
import java.util.Scanner;
public class CalculateGrades{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	// take user input
	System.out.println("Enter marks of physics: ");
	int marksPhysics = input.nextInt();

	System.out.println("Enter marks of chemistry: ");
	int marksChemistry = input.nextInt();
	
	System.out.println("Enter marks of maths: ");
	int marksMaths = input.nextInt();
	
	// calculate average marks and based on marks categorize them
	int averageMarks = (marksPhysics + marksChemistry + marksMaths) /3;
	
	if (averageMarks >= 80){
	    System.out.println("Average marks = " + averageMarks + ", Grade = A, Remark = Level 4, above agency-normalized standards");
	} else if (averageMarks >= 70) {
	    System.out.println("Average marks = " + averageMarks + ", Grade = B, Remark = Level 3, at agency-normalized standards");
	} else if (averageMarks >= 60) {
	    System.out.println("Average marks = " + averageMarks + ", Grade = C, Remark = Level 2, below, but approaching agency-normalized standards");
	} else if (averageMarks >= 50) {
	    System.out.println("Average marks = " + averageMarks + ", Grade = D, Remark = Level 1, well below agency-normalized standards");
	} else if (averageMarks >= 40) {
	    System.out.println("Average marks = " + averageMarks + ", Grade = E, Remark = Level 1-, too below agency-normalized standards");
	} else {
	    System.out.println("Average marks = " + averageMarks + ", Grade = R, Remark = Remedial standards");
	}
	input.close();
    }
}
