package hackerrank;

import java.util.Scanner;

/**
 * Given set S = {1,2,3,...,N}. Find two integers, A and B (where A < B ), from set S such that the value of A&B
 * is the maximum possible and also less than a given integer, K. In this case, & represents the bitwise AND operator.
 */
public class bitwiseAND {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.println();
        for (int a0 = 0; a0 < t; a0++) {
            int result = 0;
            int n = in.nextInt();
            int k = in.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int a = 1; a < i; a++) {
                    int tmp = i & a;
                    if (result < tmp & tmp < k)
                        result = tmp;
                }
            }
            System.out.println(result);
        }
    }
}
