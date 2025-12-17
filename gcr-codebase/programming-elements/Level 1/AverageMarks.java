//Creating a class name AverageMarks
public class AverageMarks{
    public static void main(String[] args){
	//creating a variable names as subjects and storing their marks
	double maths = 94;
	double physics = 95;
	double chemistry = 96;
	
	// counting the the average marks
	double avg = ((maths + physics + chemistry)/300) * 100;
	
	// Display the results
	System.out.println("The average marks of sam is " + avg);
    }
}
	