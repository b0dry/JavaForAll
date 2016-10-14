package hackerrank;

import java.util.*;
import java.io.*;

/**
 * Created by DDinkov on 14-Oct-16 4:11 PM.
 * https://www.hackerrank.com/challenges/java-loops
 */
public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int subResult = 0;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            subResult = subResult + a;
            for (int j = 0; j < n; j++) {
                subResult = subResult + (int) (Math.pow(2, j)) * b;
                System.out.print(subResult + " ");
            }
            subResult = 0;
            System.out.println();
        }
        in.close();
    }
}
