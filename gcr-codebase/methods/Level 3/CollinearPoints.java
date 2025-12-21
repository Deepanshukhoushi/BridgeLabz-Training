public class CollinearPoints {

    // Method to check collinearity using slope formula
    static boolean isCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {

        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {

        double area = 0.5 * (
                x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2)
        );

        return area == 0;
    }

    // Main method
    public static void main(String[] args) {

        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        System.out.println("Points:");
        System.out.println("A (" + x1 + "," + y1 + ")");
        System.out.println("B (" + x2 + "," + y2 + ")");
        System.out.println("C (" + x3 + "," + y3 + ")");

        System.out.println("\nUsing Slope Formula:");
        System.out.println("Collinear: " + isCollinearBySlope(x1, y1, x2, y2, x3, y3));

        System.out.println("\nUsing Area of Triangle Formula:");
        System.out.println("Collinear: " + isCollinearByArea(x1, y1, x2, y2, x3, y3));
    }
}
