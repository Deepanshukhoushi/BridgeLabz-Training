import java.util.Scanner;
public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double GST_RATE = 0.05; // 5% GST
        while (true) {
            System.out.print("\nEnter coffee type (Espresso / Latte / Cappuccino) or type 'exit' to stop: ");
            String coffeeType = sc.next();

            // stop condition
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you! Cafe closed ☕");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            double pricePerCup = 0.0;

            // switch to decide price
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    pricePerCup = 120;
                    break;

                case "latte":
                    pricePerCup = 150;
                    break;

                case "cappuccino":
                    pricePerCup = 180;
                    break;

                default:
                    System.out.println("Invalid coffee type!");
                    continue; // skip this order
            }

            // bill calculation
            double total = pricePerCup * quantity;
            double gst = total * GST_RATE;
            double finalBill = total + gst;

            // display bill
            System.out.println("\n----- BILL DETAILS -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Base Amount : " + total);
            System.out.println("GST (5%)    : " + gst);
            System.out.println("Total Bill  : " + finalBill);
            System.out.println("------------------------");
        }
        sc.close();
    }
}
