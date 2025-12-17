import java.util.Scanner;
public class SideOfSquare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Formula: Perimeter = 4 × side
        double side = perimeter / 4;

        // Output
        System.out.println();
        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);

        input.close();
    }
}
