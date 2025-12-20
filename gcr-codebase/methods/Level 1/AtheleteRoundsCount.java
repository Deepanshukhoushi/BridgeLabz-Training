//import Scanner and create class Called AtheleteRoundsCount
import java.util.Scanner;
public class AtheleteRoundsCount{
    public static int perimeterOfTrangle(int sideOfTrangle){
	int perimeter = sideOfTrangle*3;
	int completeRun = 5000/perimeter;
	return completeRun;
    }

    public static void main(String[] args){
	//take user input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter size of side: ");
	int sideOfTrangle = input.nextInt();
	int totalRounds = AtheleteRoundsCount.perimeterOfTrangle(sideOfTrangle);
	
	System.out.println("The number of rounds the athelete needs is " + totalRounds);
    }
}	
