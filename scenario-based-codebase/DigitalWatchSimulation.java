/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

public class DigitalWatchSimulation{
    public static void main(String[] args){
	int hours = 24;
	int minutes = 60;
	for(int i = 0; i <24; i++){
	    if (i ==0) { 
		System.out.println("\n-----It's " + "12" + " O'Clock-----\n");
	    }
	    else{
	        System.out.println("\n-----It's " + i + " O'Clock-----\n");
	    }
	    if (i == 13){
		System.out.println("-----Power Cut-----");
		System.out.println("---Clock closed----");
		break;
	    }
	
	    for(int j = 0; j<60; j++){
		System.out.println(i + ":"+ j);
	    }
	}
    }
}