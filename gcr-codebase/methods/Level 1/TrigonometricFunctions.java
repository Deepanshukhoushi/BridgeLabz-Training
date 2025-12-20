import java.util.*;
public class TrigonometricFunctions{
    public static double[] calculateTrigonometricFunctions(double angle){
	double angleInRadians = Math.toRadians(angle);
	double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);

        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	// Taking input
	System.out.print("Enter angle in degrees: ");
	double angle = input.nextDouble();
	double[] result = TrigonometricFunctions.calculateTrigonometricFunctions(angle);
	
	System.out.println("Sine value     : " + result[0]);
        System.out.println("Cosine value   : " + result[1]);
        System.out.println("Tangent value  : " + result[2]);

        input.close();
    }
}