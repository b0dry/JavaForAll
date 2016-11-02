package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 28-Oct-16 2:08 PM.
 * https://www.hackerrank.com/challenges/30-scope
 */
class Difference {
    private int[] elements;
    public int maximumDifference;
    private int minValue = Integer.MAX_VALUE;
    private int maxValue = Integer.MIN_VALUE;

    Difference(int[] arr) {
        this.elements = arr;
    }

    void computeDifference() {

        for (int value: elements) {
            if (value > maxValue)
                maxValue = value;
            if (value < minValue)
                minValue = value;
        }

        maximumDifference = Math.abs(maxValue - minValue);

    }

}

public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }


}
