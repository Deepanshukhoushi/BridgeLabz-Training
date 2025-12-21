import java.util.Scanner;
public class LeapYearCheck {

    // Method to check leap year
    static boolean isLeapYear(int year) {
        return (year >= 1582) &&
               ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter a year which you want to check: ");
        int year = sc.nextInt();

        if (isLeapYear(year))
            System.out.println("Year is a Leap Year");
        else
            System.out.println("Year is not a Leap Year");
    }
}
