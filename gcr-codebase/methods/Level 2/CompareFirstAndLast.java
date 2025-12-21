import java.util.Scanner;
public class CompareFirstAndLast {

    // Method to check positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Take input
	System.out.println("Enter five numbers ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Check positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");
                if (isEven(numbers[i]))
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        // Compare first and last element
        int result = compare(numbers[0], numbers[4]);

        if (result == 1)
            System.out.println("First element is greater than last");
        else if (result == 0)
            System.out.println("First and last elements are equal");
        else
            System.out.println("First element is less than last");
        sc.close();
    }
}
