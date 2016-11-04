package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 04-Nov-16 4:30 PM.
 * https://www.hackerrank.com/challenges/30-interfaces
 */
public class SolutionDay19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator =  new CalculatorDay19();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
