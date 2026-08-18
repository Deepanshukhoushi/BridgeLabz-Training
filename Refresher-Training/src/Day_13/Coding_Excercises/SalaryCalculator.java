package Day_13.Coding_Excercises;

public class SalaryCalculator {
    double calculateSalary(double basic){
        return basic;
    }
    double calculateSalary(double basic, double bonus){
        return basic+bonus;
    }
    double calculateSalary(double basic, double bonus, double deduction){
        return basic+bonus-deduction;
    }

    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator();
        System.out.println(sc.calculateSalary(55));
        System.out.println(sc.calculateSalary(55, 44));
        System.out.println(sc.calculateSalary(55, 45, 4));
    }
}
