package Day_13.Coding_Excercises;

enum OrderStatus {
    PLACED, SHIPPED, DELIVERED, CANCELLED;

    boolean isFinal() {
        return this == DELIVERED || this == CANCELLED;
    }
}

public class OrderStatusEnum {
    public static void main(String[] args) {
        OrderStatus[] orders = {
            OrderStatus.PLACED,
            OrderStatus.SHIPPED,
            OrderStatus.DELIVERED,
            OrderStatus.CANCELLED
        };

        for (OrderStatus status : orders) {
            System.out.println("Status: " + status + " | Final: " + status.isFinal());
        }
    }
}
