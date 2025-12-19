import java.util.Scanner;
public class LeapYearSingle {
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a year which you want to check leap or not: ");
	int year = input.nextInt();
	
	if ((year%400==0) || (year%4 ==0 && year%100 != 0)){
	    System.out.println(year + " is Leap year");
	} else {
	    System.out.println(year + " is not Leap year");
	}
	input.close();
    }
}