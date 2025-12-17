import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Conversions
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Output
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        scanner.close();
    }
}
