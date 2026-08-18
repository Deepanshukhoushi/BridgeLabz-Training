package Day_12.OOPS_Practice.PizzaOrder;

public class PizzaMain {
    public static void main(String[] args) {

        Pizza p1 = new Pizza("Small");
        Pizza p2 = new Pizza("Medium", "Thin Crust");
        Pizza p3 = new Pizza("Large", "Stuffed Crust", 3);
        Pizza p4 = new Pizza("Medium", "Regular", 2, 999.0);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
