package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 27-Oct-16 4:41 PM.
 * https://www.hackerrank.com/challenges/30-binary-numbers
 */
public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        StringBuilder intToString = new StringBuilder(Integer.toBinaryString(n));
        //System.out.println(Integer.toBinaryString(n));
        int result = 0;
        int a = 0;
        for (int i = 0; i < intToString.length(); i++) {
            if (intToString.charAt(i) == '1')
                a++;
            else
                a = 0;

            if (a > result)
                result = a;
        }
        System.out.println(result);
    }
}
