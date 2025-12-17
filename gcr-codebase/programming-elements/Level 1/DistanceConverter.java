import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversions
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        // Output
        System.out.println();
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);

        input.close();
    }
}
