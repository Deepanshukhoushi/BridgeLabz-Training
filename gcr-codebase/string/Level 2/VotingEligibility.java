import java.util.Random;
public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // generates age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            // Validate age
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";   // can vote
            } else {
                result[i][1] = "false";  // cannot vote
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {
        System.out.println("\nAge\tCan Vote");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        int numberOfStudents = 10;

        // Generate random ages
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] result = checkVotingEligibility(ages);

        // Display result
        displayResult(result);
    }
}
