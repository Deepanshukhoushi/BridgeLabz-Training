package Day_16.HackerRank_Problems;
import java.util.*;

public class StaticBlock {
    static int B;
    static int H;
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B<=0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(B*H);
        }
    }
    public static void main(String[] args) {

    }
}
