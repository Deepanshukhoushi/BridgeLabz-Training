package com.geomeasure;
import java.util.Scanner;
public class LineApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for Line 1:");
        Line line1 = readLine(scanner);

        System.out.println("\nEnter coordinates for Line 2:");
        Line line2 = readLine(scanner);

        LineService service = new LineService();
        service.compareLines(line1, line2);

        scanner.close();
    }

    private static Line readLine(Scanner scanner) {
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        return new Line(x1, y1, x2, y2);
    }
}
