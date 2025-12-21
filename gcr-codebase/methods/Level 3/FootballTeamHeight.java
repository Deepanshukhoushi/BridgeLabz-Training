public class FootballTeamHeight {

    // Method to generate random heights
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // 150 to 250
        }
        return heights;
    }

    // Method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    // Main method
    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        System.out.println("Player Heights (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        System.out.println("\n\nResults:");
        System.out.println("Shortest Height : " + findShortest(heights) + " cm");
        System.out.println("Tallest Height  : " + findTallest(heights) + " cm");
        System.out.println("Mean Height     : " + findMean(heights) + " cm");
    }
}
