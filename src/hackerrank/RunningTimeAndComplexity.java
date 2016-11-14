package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by dobromirdinkov on 11/11/16.
 * https://www.hackerrank.com/challenges/30-running-time-and-complexity
 */
public class RunningTimeAndComplexity {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner sc = new Scanner(System.in);
        int numberOfTests = sc.nextInt();
        for (int test = 0; test < numberOfTests; test++) {
            if (checkDividers(sc.nextLong())) {
                System.out.println ("Not prime");
            } else {
                System.out.println ("Prime");
            }
        }
        sc.close();
    }

    public static boolean checkDividers (long number) {
        if (number == 2)
            return false;

        if (number < 2 || number % 2 == 0)
            return true;

        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return true;
            }
        }
        return false;
    }
}
