package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 17-Oct-16 11:34 AM.
 * https://www.hackerrank.com/challenges/java-string-compare
 */
public class JavaStringCompare {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named SolutionDay18. */
        int step;
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        step = sc.nextInt();
        sc.close();

        String max = str.substring(0, step);
        String min = str.substring(0, step);
        for (int i = 0; i + step <= str.length(); i++) {
            if (str.substring(i, i + step).compareTo(min) < 0)
                min = str.substring(i, i + step);

            if (str.substring(i, i + step).compareTo(max) > 0)
                max = str.substring(i, i + step);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
