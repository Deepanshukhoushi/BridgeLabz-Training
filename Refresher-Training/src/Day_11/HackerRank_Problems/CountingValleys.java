package Day_11.HackerRank_Problems;

import java.util.Scanner;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int altitutde= 0;
        int valleys = 0;


        for(char step : path.toCharArray()){
            if (step == 'U'){
                altitutde++;
                if (altitutde == 0) valleys++;
            } else {
                altitutde--;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(countingValleys(input.nextInt(), input.next()));
    }
}
