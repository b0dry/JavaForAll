package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 07-Nov-16 3:12 PM.
 * https://www.hackerrank.com/challenges/30-sorting
 */
public class Sorting {
    static int totalSwaps = 0;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    a = swap(a, j, j + 1);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.printf("Array is sorted in %d swaps.%n", totalSwaps);
        System.out.printf("First Element: %d%n", a[0]);
        System.out.printf("Last Element: %d%n", a[n - 1]);
    }

    private static int[] swap(int[] a, int i, int i1) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
        totalSwaps++;
        return a;
    }
}
