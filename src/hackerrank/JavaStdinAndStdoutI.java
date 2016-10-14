package hackerrank;

import java.util.*;

/**
 * Created by DDinkov on 14-Oct-16 2:15 PM.
 * https://www.hackerrank.com/challenges/java-stdin-and-stdout-1
 */
public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        while (scan.hasNext()) {
            a = scan.nextInt();
            System.out.println(a);
        }
    }
}
