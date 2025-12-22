public class EmployeeBonus {

    // Method to generate salary and years of service
    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2]; // [salary][years]

        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000); // 5-digit salary
            data[i][1] = 1 + (int)(Math.random() * 10);       // 1–10 years
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][2]; // [newSalary][bonus]

        for (int i = 0; i < data.length; i++) {
            double bonusRate = (data[i][1] > 5) ? 0.05 : 0.02;
            double bonus = data[i][0] * bonusRate;
            double newSalary = data[i][0] + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to calculate totals and display table
    public static void displayReport(int[][] oldData, double[][] newData) {

        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");

        for (int i = 0; i < oldData.length; i++) {
            totalOld += oldData[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];

            System.out.printf("%d\t%d\t\t%d\t%.2f\t%.2f\n",
                    (i + 1),
                    oldData[i][0],
                    oldData[i][1],
                    newData[i][1],
                    newData[i][0]);
        }

        System.out.println("\nTotal Old Salary : " + totalOld);
        System.out.println("Total Bonus      : " + totalBonus);
        System.out.println("Total New Salary : " + totalNew);
    }

    // Main method
    public static void main(String[] args) {

        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonus(employeeData);

        displayReport(employeeData, bonusData);
    }
}
