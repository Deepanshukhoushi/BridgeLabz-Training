import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    // Method to take date input
    static LocalDate takeDateInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        return LocalDate.parse(input);
    }

    // Method to perform date arithmetic
    static LocalDate calculateDate(LocalDate date) {
        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);
        date = date.minusWeeks(3);

        return date;
    }

    public static void main(String[] args) {
        LocalDate inputDate = takeDateInput();
        LocalDate finalDate = calculateDate(inputDate);

        System.out.println("Final Date after calculations: " + finalDate);
    }
}
