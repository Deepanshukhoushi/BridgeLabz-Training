import java.util.Scanner;
public class SumOfNaturalNumbers {

    // Recursive method
    static int recursiveSum(int n) {
        if (n == 0)
            return 0;
        return n + recursiveSum(n - 1);
    }

    // Formula method
    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a natural number");
            return;
        }

        int sumByRecursion = recursiveSum(n);
        int sumByFormula = formulaSum(n);

        System.out.println("Sum using recursion = " + sumByRecursion);
        System.out.println("Sum using formula = " + sumByFormula);

        if (sumByRecursion == sumByFormula)
            System.out.println("Both results are correct");
        else
            System.out.println("Results are not equal");
    }
}
