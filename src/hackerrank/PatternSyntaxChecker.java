package hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by DDinkov on 18-Oct-16 4:32 PM.
 * https://www.hackerrank.com/challenges/pattern-syntax-checker
 */
public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            //Write your code
            try {
                String pattern = in.nextLine();
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
