import java.util.Scanner;
public class ElectionBoothManager {

    // Method to check eligibility
    public static boolean isEligible(int age) {
        return age >= 18;
    }

    // Method to record vote
    public static int recordVote(Scanner sc) {
        System.out.println("Vote for candidate:");
        System.out.println("1. Candidate A");
        System.out.println("2. Candidate B");
        System.out.println("3. Candidate C");
        System.out.print("Enter your vote (1/2/3): ");
        return sc.nextInt();
    }

    // Method to display results
    public static void displayResults(int c1, int c2, int c3) {
        System.out.println("\n--- Election Results ---");
        System.out.println("Candidate A Votes: " + c1);
        System.out.println("Candidate B Votes: " + c2);
        System.out.println("Candidate C Votes: " + c3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {
            System.out.print("\nEnter age of voter (-1 to exit): ");
            int age = scanner.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            if (!isEligible(age)) {
                System.out.println("Not eligible to vote.");
                continue;
            }

            System.out.println("Eligible to vote.");
            int vote = recordVote(scanner);

            if (vote == 1) {
                candidate1Votes++;
            } else if (vote == 2) {
                candidate2Votes++;
            } else if (vote == 3) {
                candidate3Votes++;
            } else {
                System.out.println("Invalid vote!");
            }
        }

        displayResults(candidate1Votes, candidate2Votes, candidate3Votes);
        scanner.close();
    }
}
