import java.util.Scanner;
public class YoungestAndTallest {

    // Method to find youngest friend
    static int findYoungest(int[] age) {
        int minIndex = 0;
        for (int i = 1; i < age.length; i++)
            if (age[i] < age[minIndex])
                minIndex = i;
        return minIndex;
    }

    // Method to find tallest friend
    static int findTallest(double[] height) {
        int maxIndex = 0;
        for (int i = 1; i < height.length; i++)
            if (height[i] > height[maxIndex])
                maxIndex = i;
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        int youngestIndex = findYoungest(age);
        int tallestIndex = findTallest(height);

        System.out.println("Youngest friend is: " + names[youngestIndex]);
        System.out.println("Tallest friend is: " + names[tallestIndex]);

        sc.close();
    }
}
