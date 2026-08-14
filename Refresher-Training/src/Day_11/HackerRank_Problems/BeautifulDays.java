package Day_11.HackerRank_Problems;

public class BeautifulDays {
    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int day = i; day <= j; day++) {
            int reversed = Integer.parseInt(new StringBuilder().append(day).reverse().toString());
            int diff = Math.abs(day - reversed);
            if (diff % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = 20, j = 23, k = 6;
        System.out.println(beautifulDays(i, j, k));
    }
}
