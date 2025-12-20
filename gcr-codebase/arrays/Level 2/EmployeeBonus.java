import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;

        // Arrays to store data
        double[] salary = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonusAmount = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];

        // Variables to store totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // taking input
        System.out.println("Enter salary and years of service for 10 employees:");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {

            System.out.print("Employee " + (i + 1) + " Salary: ");
            double sal = input.nextDouble();

            System.out.print("Employee " + (i + 1) + " Years of Service: ");
            double years = input.nextDouble();

            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--; // decrement index to re-enter values
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // Bonus calculation loop
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {

            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;
            } else {
                bonusAmount[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonusAmount[i];

            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
        input.close();
    }
}
