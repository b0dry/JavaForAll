package hackerrank;

/**
 * Created by DDinkov on 03-Nov-16 2:27 PM.
 * https://www.hackerrank.com/challenges/30-more-exceptions
 */
class Calculator {

    int power(int a, int pow) throws Exception {
        if (a < 0 || pow < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            if (pow == 0)
                return 1;
            else
                return a * power(a, pow - 1);
        }
    }
}