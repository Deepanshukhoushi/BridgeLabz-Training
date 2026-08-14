package Day_11.HackerRank_Problems;

import java.util.*;

public class DesignerPDFViewer {
    public static int designerPdfViewer(int[] h, String word) {
        int maxHeight = 0;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            maxHeight = Math.max(maxHeight, h[index]);
        }
        return maxHeight * word.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] h = new int[26];
        for (int i = 0; i < 26; i++) {
            h[i] = sc.nextInt();
        }
        String word = sc.next();
        sc.close();

        System.out.println(designerPdfViewer(h, word));
    }
}
