package Day_1.HackerRank_based_Codebase;

import java.io.*;

public class JavaStringTokens {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if (s == null || s.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.trim().split("[^A-Za-z]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
