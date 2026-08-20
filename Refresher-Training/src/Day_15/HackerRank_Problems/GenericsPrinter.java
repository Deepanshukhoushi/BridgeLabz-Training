package Day_15.HackerRank_Problems;

import java.util.*;

class Printer {
    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class GenericsPrinter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        Printer.printArray(intArray);
        Printer.printArray(stringArray);

        sc.close();
    }
}
