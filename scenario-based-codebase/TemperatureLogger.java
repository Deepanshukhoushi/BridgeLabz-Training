/*
11. Temperature Logger
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Madoubleain readable naming and modular code blocks.
*/

import java.util.Scanner;
public class TemperatureLogger{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Previous 7 days temperature in celcius: ");
	double[] tempRecord = new double[7];
	for (int i = 0; i < tempRecord.length; i++){	
	    System.out.print("Enter Day " + (i+1) + " temperature: ");
	    tempRecord[i] = input.nextDouble();
	}

	double totalTemp = 0;
	double maxTemp = 0;
	for (int i = 0; i < tempRecord.length; i++){
	    totalTemp += tempRecord[i];	
	    if (tempRecord[i] > maxTemp){
		maxTemp = tempRecord[i];
	    } else {
		continue;
	    }
	}
	double average = totalTemp/7;
	System.out.println("-----Record of Previous 7 Days-----");
	for(int i = 0; i < tempRecord.length; i++){
	    System.out.println("Day " + (i+1) + " temperature = " + tempRecord[i]);
	}
	System.out.println("-----------------------------------");
	System.out.println("Average Temperature = " + average);
	System.out.println("Maximum Temperature = " + maxTemp);
	input.close();
    }
}