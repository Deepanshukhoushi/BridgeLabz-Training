import java.util.*;
public class CelsiustoFahrenheit {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter Celsius: ");
  	int celsius = sc.nextInt();
	
	int fahrenheit = (celsius * 9/5) + 32;
	
	System.out.println("Fahrenheit :" + fahrenheit);
    }
}