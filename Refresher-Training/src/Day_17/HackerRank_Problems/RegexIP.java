package Day_17.HackerRank_Problems;

import java.io.*;
import java.util.*;

class MyRegex {
    public static final String pattern =
            "^((0{0,2}[0-9]|0{0,2}(?:[1-9][0-9]?)|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}"
                    + "(0{0,2}[0-9]|0{0,2}(?:[1-9][0-9]?)|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
}

public class RegexIP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            String str = input.next();
            System.out.println(str.matches(MyRegex.pattern));
        }
    }
}

