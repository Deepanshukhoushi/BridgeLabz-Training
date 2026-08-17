package Day_12.OOPS_Practice.ReferenceVariable;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);

        Rectangle rect2 = rect1;

        rect2.scale(2);

        System.out.println("rect1 length: " + rect1.length);
        System.out.println("rect1 width: " + rect1.width);
    }
}
