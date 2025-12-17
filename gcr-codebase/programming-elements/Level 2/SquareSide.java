import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        scanner.close();
    }
}
