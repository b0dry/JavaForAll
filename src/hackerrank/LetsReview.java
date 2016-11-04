package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 21-Oct-16 11:54 AM.
 * https://www.hackerrank.com/challenges/30-review-loop
 */
public class LetsReview {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution18. */
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.nextLine();
        for (int lineIndex = 0; lineIndex < lines; lineIndex++) {
            String lineContent = sc.nextLine();
            StringBuilder evenResult = new StringBuilder();
            StringBuilder oddResult = new StringBuilder();
            for (int index = 0; index < lineContent.length(); index++) {
                if (index % 2 == 0)
                    evenResult = evenResult.append(lineContent.charAt(index));
                else
                    oddResult = oddResult.append(lineContent.charAt(index));
            }
            System.out.printf("%s %s\n", evenResult, oddResult);
        }

    }
}
