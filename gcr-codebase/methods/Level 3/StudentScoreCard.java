import java.util.Scanner;
public class StudentScoreCard {

    // Method to generate random 2-digit PCM scores
    static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; // P, C, M

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int)(Math.random() * 90); // 2-digit marks
            }
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3]; // total, avg, %

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // Method to get grade
    static char getGrade(double percent) {
        if (percent >= 80) return 'A';
        else if (percent >= 70) return 'B';
        else if (percent >= 60) return 'C';
        else if (percent >= 50) return 'D';
        else if (percent >= 40) return 'E';
        else return 'R';
    }

    // Method to display scorecard
    static void displayScoreCard(int[][] scores, double[][] result) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {
            char grade = getGrade(result[i][2]);

            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade);
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[][] scores = generateScores(n);
        double[][] result = calculateResults(scores);

        displayScoreCard(scores, result);
        input.close();
    }
}
