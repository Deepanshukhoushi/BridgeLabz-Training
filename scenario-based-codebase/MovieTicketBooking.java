/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/


import java.util.Scanner;
public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            int moviePrice = 0;
            String movieType = "";

            System.out.println("\nMOVIE TICKET BOOKING");
            System.out.println("1. Action");
            System.out.println("2. Fiction");
            System.out.println("3. Comedy");
            System.out.println("4. Drama");
            System.out.println("5. Family");
            System.out.print("Enter movie choice: ");

            int movieChoice = input.nextInt();

            switch (movieChoice) {
                case 1: movieType = "Action";  moviePrice = 300; break;
                case 2: movieType = "Fiction"; moviePrice = 280; break;
                case 3: movieType = "Comedy";  moviePrice = 250; break;
                case 4: movieType = "Drama";   moviePrice = 220; break;
                case 5: movieType = "Family";  moviePrice = 240; break;
                default:
                    System.out.println("Invalid movie choice");
                    continue;
            }

            // Seat Selection
            System.out.print("Enter Seat Type (GOLD / SILVER): ");
            String seatType = input.next();

            if (seatType.equalsIgnoreCase("GOLD")) {
                moviePrice += 100;
            } else if (seatType.equalsIgnoreCase("SILVER")) {
                moviePrice += 50;
            } else {
                System.out.println("Invalid seat type");
                continue;
            }

            // Snack Selection
            System.out.println("Choose Snack:");
            System.out.println("1. Popcorn (80)");
            System.out.println("2. Soft Drink (50)");
            System.out.println("3. Pizza (120)");
            System.out.println("4. Samosa (40)");
            System.out.println("5. Coffee (60)");
            System.out.print("Enter choice: ");

            int snackChoice = input.nextInt();
            int snackPrice = 0;

            if (snackChoice == 1) snackPrice = 80;
            else if (snackChoice == 2) snackPrice = 50;
            else if (snackChoice == 3) snackPrice = 120;
            else if (snackChoice == 4) snackPrice = 40;
            else if (snackChoice == 5) snackPrice = 60;

            int totalBill = moviePrice + snackPrice;

            System.out.println("\nBOOKING CONFIRMATION");
            System.out.println("Movie: " + movieType);
            System.out.println("Seat: " + seatType);
            System.out.println("Total Amount: " + totalBill);

            // Exit decision
            System.out.print("\nBook for next customer? (y/n): ");
            char choice = input.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                break;
            }
        }

        System.out.println("\nThank you for using Movie Ticket Booking App");
        input.close();
    }
}
