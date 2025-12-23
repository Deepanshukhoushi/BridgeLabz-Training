import java.util.*;
public class StudentGradeSystem {

    // Generate random 2-digit PCM marks for all students
    public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3];
        Random random = new Random();
        for (int i = 0; i < students; i++) {
            scores[i][0] = random.nextInt(90) + 10; 
            scores[i][1] = random.nextInt(90) + 10; 
            scores[i][2] = random.nextInt(90) + 10; 
        }
        return scores;
    }

    // Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Calculate grade based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double p = results[i][2];

            if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else if (p >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Display scorecard in tabular format
    public static void displayScorecard(
            int[][] scores, double[][] results, String[] grades) {

        System.out.println("\nID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2] + "\t" +
                    grades[i]);
        }
    }

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        int[][] scores = generatePCMScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);
    }
}
