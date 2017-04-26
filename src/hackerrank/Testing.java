package hackerrank;

import java.util.Random;

/**
 * Created by DDinkov on 14-Apr-17 5:20 PM.
 * https://www.hackerrank.com/challenges/30-testing
 */

public class Testing {

    public static void main(String[] args) {

        /*
        Create and print a test case for the problem above that meet the following criteria:
        t <= 5
        3 <= n <= 200 - n is number of the students in the lecture
        1 <= k <= n - k is cancellation threshold
        -10^3 <= ai <= 10^3, where i is between [1,n]
        The value of  must be distinct across all the test cases.
        Array  must have at least  zero,  positive integer, and  negative integer.
        */

        //Generate random number for lectures between 1 and 5
        int t = (randInt(1, 5));
        System.out.println(t);
        //Cycle for 't' lectures
        for (int i = 0; i < t; i++) {
            Lecture lecture = new Lecture();
            System.out.println(lecture.countedStudents + " " + lecture.cancellationThreshold);
            System.out.println(lecture.arrivalTimeList);

        }
    }

    //Generates the random Int in a range
    static int randInt(int min, int max) {
        Random rn = new Random();
        return rn.nextInt((max - min) + 1) + min;
    }

    public static class Lecture {
        int countedStudents = randInt(3, 200);
        int cancellationThreshold = randInt(1, countedStudents);

        String arrivalTimeList = generateString(countedStudents);

        private static String generateString(int cStudents) {
            StringBuilder resultString = new StringBuilder("-1 0 1 ");
            for (int i = 3; i < cStudents; i++) {
                resultString.append(randInt(-1000, 1000)).append(" ");
            }
            return resultString.toString();
        }
    }

}