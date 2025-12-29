/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;

public class RechargeSimulator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int balance = 0;
        boolean continueRecharge = true;

        System.out.println("Press 1 for Jio");
        System.out.println("Press 2 for Airtel");
        System.out.println("Press 3 for VI");
        System.out.println("Press 4 for BSNL");
        System.out.print("Choose Operator: ");

        int operator = input.nextInt();

        while (continueRecharge) {

            switch (operator) {

                case 1:
                    System.out.println("\nJio Offers");
                    break;
                case 2:
                    System.out.println("\nAirtel Offers");
                    break;
                case 3:
                    System.out.println("\nVI Offers");
                    break;
                case 4:
                    System.out.println("\nBSNL Offers");
                    break;
                default:
                    System.out.println("Invalid Operator");
                    input.close();
                    return;
            }

            System.out.println("1: 299 Unlimited Data (28 Days)");
            System.out.println("2: 249 1.5GB/Day (28 Days)");
            System.out.println("3: Exit");
            System.out.print("Choose recharge plan: ");

            int recharge = input.nextInt();

            switch (recharge) {
                case 1:
                    balance += 299;
                    System.out.println("Recharge of ₹299 successful");
                    break;

                case 2:
                    balance += 249;
                    System.out.println("Recharge of ₹249 successful");
                    break;

                case 3:
                    continueRecharge = false;
                    System.out.println("Thank you for using Recharge Simulator");
                    break;

                default:
                    System.out.println("Invalid Plan");
            }

            System.out.println("Current Balance: " + balance + "Rs.");
        }

        input.close();
    }
}
