package Day_7.HackerRank_Problems;

import java.util.Scanner;

public class DavisStaircase {
    public static int stepPerms(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        if (n == 3) {
            return 4;
        }

        // Recursive case
        return stepPerms(n - 1)
                + stepPerms(n - 2)
                + stepPerms(n - 3);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of steps: ");
        int n = sc.nextInt();

        System.out.println("Number of ways: " + stepPerms(n));

        sc.close();
    }
}
