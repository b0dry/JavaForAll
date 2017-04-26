package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 03-Nov-16 2:26 PM.
 * https://www.hackerrank.com/challenges/30-more-exceptions
 */
public class MoreExceptions {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            CalculatorDay17 myCalculator = new CalculatorDay17();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
