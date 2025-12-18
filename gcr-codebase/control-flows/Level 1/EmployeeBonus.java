//import scanner and create class EmployeeBonus
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args){
	
	//Take input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Employee salary: ");
	double salary = input.nextDouble();
	System.out.println("Enter years of service: ");
	int yearOfService = input.nextInt();
	
	double bonus = 0;

	//Check service condition
	if(yearOfService > 5) {
	    bonus = salary * 0.05;
	}
	
	System.out.println("Bonus amount: " + bonus);
	
	input.close();
    }
}