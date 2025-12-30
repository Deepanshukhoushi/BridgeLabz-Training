/*
13. Sandeep’s Fitness Challenge Tracker 
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/


import java.util.Scanner;
public class FitnessChallengeTracker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] weeklyPushUps = new int[7];

        for (int day = 0; day < weeklyPushUps.length; day++) {

            // Every 3rd day is a rest day
            if ((day + 1) % 3 == 0) {
                System.out.println("Day " + (day + 1) + " is a rest day");
                continue;
            }

            System.out.print("Enter push-ups for Day " + (day + 1) + ": ");
            weeklyPushUps[day] = input.nextInt();
        }

        int total = 0;
        int workoutDays = 0;

        for (int count : weeklyPushUps) {
            if (count == 0) {
                continue; // skip rest days
            }
            total += count;
            workoutDays++;
        }

        double average = (double) total / workoutDays;

        // ----------------- OUTPUT -----------------
        System.out.println("\nWEEKLY FITNESS REPORT");
        for (int i = 0; i < weeklyPushUps.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + weeklyPushUps[i] + " push-ups");
        }

        System.out.println("----------------------------");
        System.out.println("Total Push-ups: " + total);
        System.out.println("Average Push-ups per workout day: " + average);

        input.close();
    }
}



