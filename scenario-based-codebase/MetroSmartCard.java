import java.util.Scanner;
public class MetroSmartCard {

    // Method to calculate fare using ternary operator
    public static double calculateFare(int distance) {
        return (distance <= 5) ? 10
             : (distance <= 15) ? 20
             : 30;
    }

    // Method to deduct fare from balance
    public static double deductBalance(double balance, double fare) {
        return balance - fare;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 100.0; // Initial balance
        int choice;

        while (balance > 0) {
            System.out.println("\nCurrent Balance: " + balance);
            System.out.print("Enter distance traveled (km): ");
            int distance = scanner.nextInt();

            double fare = calculateFare(distance);
            if (fare > balance) {
                System.out.println("Insufficient balance!");
                break;
            }

            balance = deductBalance(balance, fare);
            System.out.println("Fare deducted: " + fare);
            System.out.print("Press 1 to continue or 0 to exit: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }
        }

        System.out.println("\nThank you for using Delhi Metro ");
        System.out.println("Remaining Balance: " + balance);

        scanner.close();
    }
}
