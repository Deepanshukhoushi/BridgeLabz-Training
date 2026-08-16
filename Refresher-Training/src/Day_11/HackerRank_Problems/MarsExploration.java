package Day_11.HackerRank_Problems;

import java.util.Scanner;

public class MarsExploration {
    public static int marsExploration(String s) {
        int changes = 0;
        String pattern = "SOS";

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != pattern.charAt(i%3)){
                changes++;
            }
        }
        return changes;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(marsExploration(input.next()));
    }
}
