//importing scanner class to take input from user
import java.util.Scanner;
public class HeightInFeetInches{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	// taking input from user of their height and storing it into cmHeight
	System.out.println("Enter your height in centimeters: ");
	double cmHeight = sc.nextDouble();
	
	//calculating heights in inches and feets
	double inchesHeight = cmHeight/2.54;
	int feet = (int) (inchesHeight/12);
	double inches = inchesHeight %12;
	//displaying results
	System.out.println("Your Height in cm is " + cmHeight + " while in feet is " + feet + " an inches is " + inches);
    }
}
