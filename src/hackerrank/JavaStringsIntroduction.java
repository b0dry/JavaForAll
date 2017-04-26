package hackerrank;


import java.util.Scanner;

/**
 * Created by dobromirdinkov on 10/17/16.
 * https://www.hackerrank.com/challenges/java-strings-introduction
 */
public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());

        boolean isALargerThenB = false;
        int limit;

        if (A.length() > B.length())
            limit = B.length();
        else
            limit = A.length();

        for (int i = 0; i < limit; i++) {
            if (A.charAt(i) > B.charAt(i)) {
                isALargerThenB = true;
                break;
            } else if (A.charAt(i) < B.charAt(i))
                break;
        }

        if (isALargerThenB)
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));


        sc.close();
    }
}
