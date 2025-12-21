import java.util.Scanner;
public class StudentVoteChecker {

    // Method to check voting eligibility
    public boolean canStudentVote(int age) {
        if (age < 0)
            return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            if (checker.canStudentVote(ages[i]))
                System.out.println("Student can vote");
            else
                System.out.println("Student cannot vote");
        }

        input.close();
    }
}
