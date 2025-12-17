import java.util.Scanner;
public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Read number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum handshakes
        int maximumHandshakes = calculateHandshakes(numberOfStudents);

        // Display result
        System.out.println("The maximum number of possible handshakes is " + maximumHandshakes);

        input.close();
    }

    private static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
