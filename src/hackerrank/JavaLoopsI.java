package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 14-Oct-16 3:50 PM.
 * https://www.hackerrank.com/challenges/java-loops-i
 */
public class JavaLoopsI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", N, i, N * i);
        }
    }
}
