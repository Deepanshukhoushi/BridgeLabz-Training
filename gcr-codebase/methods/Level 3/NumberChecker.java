import java.util.Scanner;
public class NumberChecker {

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int n) {
        int[] digits = new int[countDigits(n)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }


    public static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0, power = digits.length;
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == number;
    }


    public static void largestAndSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) { smax = max; max = d; }
            else if (d > smax && d != max) smax = d;
        }
        System.out.println("Largest: " + max + ", Second Largest: " + smax);
    }

    public static void smallestAndSecondSmallest(int[] digits) {
        int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) { smin = min; min = d; }
            else if (d < smin && d != min) smin = d;
        }
        System.out.println("Smallest: " + min + ", Second Smallest: " + smin);
    }


    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }


    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }


    public static int[] reverseArray(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++)
            rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int n) {
        int sq = n * n, sum = 0;
        while (sq != 0) { sum += sq % 10; sq /= 10; }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        while (n != 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n /= 10;
        }
        return sum == product;
    }


    public static boolean isAutomorphic(int n) {
        return String.valueOf(n * n).endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }


    public static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) sum += i;
        return sum;
    }

    public static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n;
    }


    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp != 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }


    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
        int number = input.nextInt();
        int[] digits = storeDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(number, digits));
        System.out.println("Harshad: " + isHarshad(number, digits));
        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeon(number));
        System.out.println("Spy: " + isSpy(number));
        System.out.println("Automorphic: " + isAutomorphic(number));
        System.out.println("Buzz: " + isBuzz(number));
        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));

        largestAndSecondLargest(digits);
        smallestAndSecondSmallest(digits);

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++)
            if (freq[i][1] > 0)
                System.out.println(i + " -> " + freq[i][1]);
    }
}
