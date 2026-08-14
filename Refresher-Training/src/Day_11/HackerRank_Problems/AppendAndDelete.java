package Day_11.HackerRank_Problems;

import java.util.Scanner;

public class AppendAndDelete {
    public static String appendAndDelete(String a, String b, int k){
        int commonLength = 0;

        for(int i = 0; i<Math.min(a.length(), b.length()); i++){
            if (a.charAt(i) == b.charAt(i)) {

                commonLength++;
            }
        }

        int deletes = a.length()-commonLength;
        int appends = b.length()-commonLength;
        int total = deletes+appends;
        if (total > k) {
            return "No";
        } else if ((k - total) % 2 == 0 || k >= a.length() + b.length()) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a = input.next();
        String b = input.next();

        int n = input.nextInt();
        System.out.println(appendAndDelete(a, b, n));
    }
}
