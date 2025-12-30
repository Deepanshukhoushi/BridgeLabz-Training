/*
15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/


import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int totalBooks = 5;
        final int finePerDay = 5;

        int totalFine = 0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("ROHAN'S LIBRARY REMINDER APP");
        System.out.println("Date Format: DD-MM-YYYY");

        for (int book = 1; book <= totalBooks; book++) {

            System.out.println("\nBook " + book);

            System.out.print("Enter Due Date (DD-MM-YYYY): ");
            String dueDateInput = input.next();
            LocalDate dueDate = LocalDate.parse(dueDateInput, formatter);

            System.out.print("Enter Return Date (DD-MM-YYYY): ");
            String returnDateInput = input.next();
            LocalDate returnDate = LocalDate.parse(returnDateInput, formatter);

            if (!returnDate.isAfter(dueDate)) {
                System.out.println("Returned on time. No fine.");
            } else {
                long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);
                int fine = (int) lateDays * finePerDay;

                totalFine += fine;

                System.out.println("Late Return!");
                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine for this book: " + fine);
            }
        }

        System.out.println("\n-------------------------------");
        System.out.println("TOTAL FINE TO BE PAID: " + totalFine);
        System.out.println("All books processed. Thank you!");
        System.out.println("-------------------------------");

        input.close();
    }
}
