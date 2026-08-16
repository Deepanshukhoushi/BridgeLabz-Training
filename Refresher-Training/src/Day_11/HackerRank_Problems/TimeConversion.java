package Day_11.HackerRank_Problems;

import java.util.Scanner;

public class TimeConversion {
    public static String conversion(String str){
        String period = str.substring(8);
        int time = Integer.parseInt(str.substring(0,2));
        String rest = str.substring(2, 8);

        if (period.equals("AM")){
            if(time == 12) time = 0;
        } else {
            if(time != 12) time += 12;
        }

        return String.format("%02d%s", time, rest);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(conversion(input.next()));
    }
}
