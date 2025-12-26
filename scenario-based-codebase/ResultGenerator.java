import java.util.Scanner;
public class ResultGenerator {

    // Method to calculate average marks
    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / 5.0;
    }

    // Method to assign grade using switch
    public static char assignGrade(double average) {
        switch ((int) average / 10) {
            case 10:
            case 9:
                return 'A';
            case 8:
            case 7:
                return 'B';
            case 6:
                return 'C';
            case 5:
            case 4:
                return 'D';
            default:
                return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        // Input marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        double average = calculateAverage(marks);
        char grade = assignGrade(average);

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
