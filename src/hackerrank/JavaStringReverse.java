package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 17-Oct-16 4:20 PM.
 * https://www.hackerrank.com/challenges/java-string-reverse
 */
public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String reversed = new StringBuffer(a).reverse().toString();
        if (a.equals(reversed))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
