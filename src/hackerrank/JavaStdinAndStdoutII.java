package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 14-Oct-16 2:15 PM.
 * https://www.hackerrank.com/challenges/java-stdin-stdout
 */
public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        //d = scan.nextDouble();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
