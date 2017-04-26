package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 21-Oct-16 2:54 PM.
 * https://www.hackerrank.com/challenges/30-arrays
 */
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}