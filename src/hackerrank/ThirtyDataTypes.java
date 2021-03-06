package hackerrank;

import java.util.Scanner;

/**
 * Created by dobromirdinkov on 10/15/16.
 * https://www.hackerrank.com/challenges/30-data-types
 * Objective
 * Today, we're discussing data types. Check out the Tutorial -
 * https://www.hackerrank.com/challenges/30-data-types/tutorial
 * tab for learning materials and an instructional video!
 * <p>
 * Task
 * Complete the code in the editor below. The variables , , and  are already declared and initialized for you. You must:
 * <p>
 * Declare  variables: one of type int, one of type double, and one of type String.
 * Read  lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
 * Use the  operator to perform the following operations:
 * Print the sum of  plus your int variable on a new line.
 * Print the sum of  plus your double variable to a scale of one decimal place on a new line.
 * Concatenate  with the string you read as input and print the result on a new line.
 * Note: If you are using a language that doesn't support using  for string concatenation (e.g.: C), you can just print
 * one variable immediately following the other on the same line.
 * The string provided in your editor must be printed first, immediately followed by the string you read as input.
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer that you must sum with .
 * The second line contains a double that you must sum with .
 * The third line contains a string that you must concatenate with .
 * <p>
 * Output Format
 * <p>
 * Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line,
 * and then the two concatenated strings on the third line.
 * <p>
 * Sample Input
 * <p>
 * 12
 * 4.0
 * is the best place to learn and practice coding!
 * Sample Output
 * <p>
 * 16
 * 8.0
 * HackerRank is the best place to learn and practice coding!
 * Explanation
 * <p>
 * When we sum the integers  and , we get the integer .
 * When we sum the floating-point numbers  and , we get .
 * When we concatenate HackerRank with is the best place to learn and practice coding!, we get HackerRank is the best
 * place to learn and practice coding!.
 * <p>
 * You will not pass this challenge if you attempt to assign the Sample Case values to your variables instead of
 * following the instructions above and reading input from stdin.
 */
public class ThirtyDataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int j;
        double t;
        String z;

        /* Read and save an integer, double, and String to your variables.*/
        j = scan.nextInt();
        t = scan.nextDouble();
        scan.nextLine();
        z = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + j);
        System.out.println(d + t);
        System.out.println(s + z);
        /* Print the sum of the double variables on a new line. */

        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */

        scan.close();
    }
}
