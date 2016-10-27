package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 27-Oct-16 5:32 PM.
 * https://www.hackerrank.com/challenges/30-2d-arrays
 */
public class TwoDimensionArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for (int j = 0; j <= 3; j++) {
            for (int i = 0; i <= 3; i++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                //System.out.printf("%d;%d%n",i,j);
                //System.out.printf("%d%n",sum);
            if (sum > result)
                result = sum;

                //sum = 0;
            }
        }
        System.out.println(result);
    }
}
