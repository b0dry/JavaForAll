package hackerrank;


import java.util.Scanner;

/**
 * Created by DDinkov on 14-Oct-16 4:49 PM.
 * https://www.hackerrank.com/challenges/java-end-of-file
 */
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long lineNumber = 0;
        while (sc.hasNextLine()) {
            lineNumber++;
            System.out.printf("%d %s%n", lineNumber, sc.nextLine());
        }
        sc.close();
    }
}

