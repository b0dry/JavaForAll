package hackerrank; /**
 * Created by DDinkov on 14-Oct-16 12:02 PM.
 * https://www.hackerrank.com/challenges/plus-minus
 * Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative,
 * and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
 * <p>
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
 * though answers with absolute error of up to  are acceptable.
 * <p>
 * Input Format:
 * --------------
 * The first line contains an integer, , denoting the size of the array.
 * The second line contains  space-separated integers describing an array of numbers .
 * <p>
 * Output Format:
 * --------------
 * <p>
 * You must print the following  lines:
 * <p>
 * A decimal representing of the fraction of positive numbers in the array.
 * A decimal representing of the fraction of negative numbers in the array.
 * A decimal representing of the fraction of zeroes in the array.
 * Sample Input
 * <p>
 * 6
 * -4 3 -9 0 4 1
 * Sample Output
 * <p>
 * 0.500000
 * 0.333333
 * 0.166667
 * Explanation
 * <p>
 * There are  positive numbers,  negative numbers, and  zero in the array.
 * The respective fractions of positive numbers, negative numbers and zeroes are ,  and , respectively.
 */

//import java.io.*;

import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        in.close();
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (int i : arr) {
            if (i > 0)
                positive = positive+1;
            else if (i < 0)
                negative++;
            else
                zeros++;

        }
        System.out.printf("%6f\n", (float) positive / (float) n);
        System.out.printf("%6f\n", (float) negative / (float) n);
        System.out.printf("%6f\n", (float) zeros / (float) n);

    }
}
