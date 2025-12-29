/*
8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/


import java.util.Scanner;
public class ShopkeeperDashboard {

    public static void main(String[] args) {
	int discount5 = 5;
        int discount10 = 10;
        int discount15 = 15;
        Scanner scanner = new Scanner(System.in);
        int totalBill = 0;

        System.out.print("Enter number of items: ");
        int numberOfItems = scanner.nextInt();

        // Taking item prices using for-loop
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.println("\nItem " + i);
            System.out.print("Enter price: ");
            int price = scanner.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            totalBill += price * quantity;
        }

        // Discount calculation using if-else
        int discountPercent;

        if (totalBill >= 5000) {
            discountPercent = discount15;
        } else if (totalBill >= 3000) {
            discountPercent = discount10;
        } else if (totalBill >= 1000) {
            discountPercent = discount5;
        } else {
            discountPercent = 0;
        }

        int discountAmount = (totalBill * discountPercent) / 100;
        int finalAmount = totalBill - discountAmount;

        // Bill Summary
        System.out.println("\n----- SHOP BILL SUMMARY -----");
        System.out.println("Total Bill Amount : " + totalBill + " Rs.");
        System.out.println("Discount Applied  : " + discountPercent + "%");
        System.out.println("Discount Amount   : " + discountAmount + " Rs.");
        System.out.println("Final Payable     : " + finalAmount + " Rs.");
        System.out.println("------------------------------");

        scanner.close();
    }
}
