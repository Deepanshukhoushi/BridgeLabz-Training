import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter base in cm: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Area in square inches
        double areaIn = areaCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is "+ areaIn + " and sq cm is " + areaCm);

        scanner.close();
    }
}
