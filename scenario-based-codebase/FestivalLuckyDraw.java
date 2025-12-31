import java.util.Scanner;

/*
20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;
public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lucky number (or -1 to exit): ");
            if (!scanner.hasNextInt()) {
                scanner.next();       
                continue;
            }

            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }

            if (number % 15 == 0) {
                System.out.println("You won the gift.");
            } else {
                System.out.println("No gift this time.");
            }
        }

        scanner.close();
        System.out.println("Lucky draw closed.");
    }
}

