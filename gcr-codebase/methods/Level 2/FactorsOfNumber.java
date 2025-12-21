import java.util.Scanner;
public class FactorsOfNumber {

    // Method to find factors
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] arr = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0) arr[index++] = i;

        return arr;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number ");
        int n = sc.nextInt();

        int[] factors = getFactors(n);

        int sum = 0, product = 1, sumSq = 0;

        for (int f : factors) {
            System.out.print(f + " ");
            sum += f;
            product *= f;
            sumSq += Math.pow(f, 2);
        }

        System.out.println("\nSum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Sum of Squares = " + sumSq);
    }
}
