package Day_14.HackerRank_Problems;

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // Inherits add() from Arithmetic
}

public class Addition {
    public static void main(String[] args) {
        Adder a = new Adder();

        // Show superclass name
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Demonstrate add method
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10));
    }
}

