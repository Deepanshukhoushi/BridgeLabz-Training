import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] Result = new int[4];

        // Find multiplication table from 6 to 9
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            Result[index] = number * i;
            index++;
        }
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + Result[index]);
            index++;
        }
        input.close();
    }
}
