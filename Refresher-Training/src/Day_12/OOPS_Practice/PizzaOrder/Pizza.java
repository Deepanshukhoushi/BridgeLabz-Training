package Day_12.OOPS_Practice.PizzaOrder;

public class Pizza {

    String size;
    String crustType;
    int toppingsCount;
    double price;

    Pizza(String size, String crustType, int toppingsCount, double price) {
        this.size = size;
        this.crustType = crustType;
        this.toppingsCount = toppingsCount;
        this.price = price;
    }

    Pizza(String size, String crustType, int toppingsCount) {
        this(size, crustType, toppingsCount, computePrice(size, toppingsCount));
    }

    Pizza(String size, String crustType) {
        this(size, crustType, 0);
    }

    Pizza(String size) {
        this(size, "Regular");
    }

    private static double computePrice(String size, int toppingsCount) {
        double basePrice;
        if (size.equals("Small")) {
            basePrice = 199.0;
        } else if (size.equals("Medium")) {
            basePrice = 299.0;
        } else {
            basePrice = 399.0;
        }
        return basePrice + (toppingsCount * 30.0);
    }

    void display() {
        System.out.println("Size: " + size + " | Crust: " + crustType +
                " | Toppings: " + toppingsCount + " | Price: " + price);
    }
}
