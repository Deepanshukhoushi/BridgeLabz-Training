/*
9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.Scanner;
public class AttendenceSystem{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);	
	int count1 = 0;
	int count2 = 0;
	System.out.println("Enter Student status Present = 1, Absent = 0");

	String[] names = {"Aman", "Naman", "Rajesh", "Raghav", "Nitin", "Harshit", "Jatin", "Abhisekh", "Ram"};
	for (int i = 0; i < names.length; i++){
	    System.out.print(names[i] + "'s Attendence status: ");
	    int chosen = input.nextInt();
	    if (chosen == 1){
		count1+=1;
	    } else if (chosen == 0) {
	    	count2+=1;
	    } else {
		System.out.println("Invalid input");
	    }
	}
	System.out.println("-----------------------");
	System.out.println("Final Attendent record");
	System.out.println("Status   counts");
 	System.out.println("Present- " + count1);
	System.out.println("Absent-  " + count2);
    }
}
	