import java.util.Scanner;
public class FactorOperations {

    // Method to find factors and return array
    static int[] findFactors(int n) {
        int count = 0;

        // Count factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        // Store factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }

    // Greatest factor
    static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors)
            if (f > max) max = f;
        return max;
    }

    // Sum of factors
    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Product of factors
    static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Product of cube of factors
    static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors)
            product *= Math.pow(f, 3);
        return product;
    }

    // Main method
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number ");
        int number = input.nextInt();
        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes: " + productOfCubes(factors));
    }
}
