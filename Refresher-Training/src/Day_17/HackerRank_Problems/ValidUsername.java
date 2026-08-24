package Day_17.HackerRank_Problems;

import java.util.Scanner;

public class ValidUsername {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n-- !=0){
            if (input.next().matches(regex)){
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }
    }
}
