package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 27-Oct-16 4:05 PM.
 * https://www.hackerrank.com/challenges/30-recursion
 */
public class Recursion {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
        sc.close();
    }

    private static int factorial(int a) {
        if (a >= 1)
            return a * factorial (a - 1);
        else
            return 1;
    }
}
