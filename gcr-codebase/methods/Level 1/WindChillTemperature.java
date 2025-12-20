import java.util.Scanner;
public class WindChillTemperature{
    public static double calculateWindChill(double temperature, double windSpeed){
	double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * (windSpeed * 0.16);
	
	return windChill;
    }
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter temperature: ");
	double temperature = input.nextDouble();
	System.out.println("Enter windspeed: ");
	double windSpeed = input.nextDouble();

	double finalResult = WindChillTemperature.calculateWindChill(temperature, windSpeed);
	System.out.println("The wind chill temperature is " + finalResult);
    }
}