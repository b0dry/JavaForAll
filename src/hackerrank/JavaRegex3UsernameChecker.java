package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DDinkov on 21-Oct-16 11:13 AM.
 * https://www.hackerrank.com/challenges/valid-username-checker
 */
public class JavaRegex3UsernameChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String username = in.nextLine();
            //String pattern = Complete this line in the editable area below
            // Explanation for regexp
            // ^[A-Za-z] - The group defining that the start of the username should be letters only
            // [A-Za-z0-9_] - Allowed chars in the username
            // {7,29} - The wight of the string
            // $ - End of the string that might be end of the line or end of the string
            String pattern = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

