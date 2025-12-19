import java.util.Scanner;
public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }
        double meanHeight = sum / heights.length;

        System.out.println("Mean height of the football team = " + meanHeight);
        input.close();
    }
}
