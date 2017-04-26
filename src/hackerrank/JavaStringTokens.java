package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 18-Oct-16 11:34 AM.
 * https://www.hackerrank.com/challenges/java-string-tokens
 */
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        scan.close();
        String[] sAsArray = (s.trim().split("[ _.,?!'@]+"));

        if (sAsArray.length == 1 && sAsArray[0].equals(""))
            System.out.println("0");
        else {
            System.out.println(sAsArray.length);
            for (String word : sAsArray) {
                System.out.println(word);
            }
        }
    }
}
