package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 18-Oct-16 4:49 PM.
 * https://www.hackerrank.com/challenges/java-regex
 */
public class JavaRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}



