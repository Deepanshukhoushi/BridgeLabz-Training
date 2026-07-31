import java.io.*;

public class CamelCase {
    public static int camelcase(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int result = camelcase(s);

        System.out.println(result);        

        bufferedReader.close();
    }
}
