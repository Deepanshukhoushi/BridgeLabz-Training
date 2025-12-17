// creating a class called DividePens
public class DividePens{
    public static void main(String[] args){
	
	// creating variables to store information
	int totalpens = 14, students = 3;
	
	//counting results
	int penseachstudent = totalpens/students;
	int remainingpens = totalpens % students;
	
	System.out.println("The Pen Per Student is " + penseachstudent + " and the remaining pen not distributed is " + remainingpens);
    }
}