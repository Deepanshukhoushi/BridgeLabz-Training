import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    // Method to take LocalDate input
    static LocalDate takeDateInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        String input = sc.nextLine();

        return LocalDate.parse(input); // yyyy-MM-dd
    }

    // Method to compare two dates
    static void compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER second date");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are SAME");
        }
    }

    public static void main(String[] args) {
        LocalDate date1 = takeDateInput("Enter first date (yyyy-MM-dd): ");
        LocalDate date2 = takeDateInput("Enter second date (yyyy-MM-dd): ");

        compareDates(date1, date2);
    }
}
