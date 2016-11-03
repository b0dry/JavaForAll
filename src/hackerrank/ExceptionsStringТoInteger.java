package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 03-Nov-16 9:32 AM.
 * https://www.hackerrank.com/challenges/30-exceptions-string-to-integer
 */
public class ExceptionsStringТoInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int i;
        try

        {
            i = Integer.valueOf(S);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}