import java.util.Scanner;
public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter base (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height (in inches): ");
        double height = input.nextDouble();

        // Area calculation (square inches)
        double areaInSquareInches = 0.5 * base * height;

        // Conversion: 1 square inch = 6.4516 square centimeters
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;

        // Output
        System.out.println();
        System.out.println("The area of the triangle in square inches is " + areaInSquareInches + " and in square centimeters is " + areaInSquareCentimeters);

        input.close();
    }
}
