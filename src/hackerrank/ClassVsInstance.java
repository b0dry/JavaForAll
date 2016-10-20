package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 20-Oct-16 3:54 PM.
 * https://www.hackerrank.com/challenges/30-class-vs-instance
 */
public class ClassVsInstance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

}

