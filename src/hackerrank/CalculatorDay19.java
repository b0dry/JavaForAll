package hackerrank;


/**
 * Created by DDinkov on 04-Nov-16 4:28 PM.
 * https://www.hackerrank.com/challenges/30-interfaces
 */
class CalculatorDay19 implements AdvancedArithmetic {
    @Override
    public int divisorSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                result = result + i;
        }
        return result;
    }
}
