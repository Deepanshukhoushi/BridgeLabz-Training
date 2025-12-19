import java.util.Scanner;
public class FindBmi{
    public static void main(String[] args){
	//taking input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter persons's weight: ");
	double weightKg = input.nextDouble();
	System.out.println("Enter persons's height: ");
	double heightCm = input.nextDouble();
	double heightM = heightCm/100;
	

	//checking bmi according to weight and height
	double bmi = weightKg /(heightM * heightM);
		
	if (bmi <=18.4){
	    System.out.println("Underweight");	
	} else if (bmi <=24.9) {
	    System.out.println("Normal");
	} else if (bmi <= 39.9) {
	    System.out.println("Overweight");
	} else {
	    System.out.println("Obese");
	}
	input.close();
    }
}