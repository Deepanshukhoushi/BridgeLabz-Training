import java.util.Scanner;
public class StudentGradeUsing2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // marks[i][0] → Physics, marks[i][1] → Chemistry, marks[i][2] → Maths
        double[][] marks = new double[numberOfStudents][3];
        double[] percentage = new double[numberOfStudents];
        char[] grade = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics marks: ");
            marks[i][0] = input.nextDouble();

            System.out.print("Chemistry marks: ");
            marks[i][1] = input.nextDouble();

            System.out.print("Maths marks: ");
            marks[i][2] = input.nextDouble();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Please enter positive values again.");
                i--; // decrement index to re-enter data
                continue;
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (totalMarks / 300) * 100;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        System.out.println("Physics Chemistry Maths Percentage Grade");

	for (int i = 0; i < numberOfStudents; i++) {
    	    System.out.println(
                marks[i][0] + "   " +
                marks[i][1] + "   " +
                marks[i][2] + "   " +
                percentage[i] + "%   " +
                grade[i]
            );
        }


        input.close();
    }
}
