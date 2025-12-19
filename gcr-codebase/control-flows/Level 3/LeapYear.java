//create class LeapYear
import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
	
	//take input from user
	System.out.println("Enter year You want to check: ");
	int year = input.nextInt();
	
	//conditions to check leap year
	if (year >= 1582){
	    if ((year%400==0) || (year%4 ==0 && year%100 != 0)){
		System.out.println(year + " is leap year");
	    } else {
		System.out.println(year +" is not a leap year");
	    }
	} else {
	    System.out.println("This year is not leap year");
	}
    }
}
