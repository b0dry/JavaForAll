package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 04-Apr-17 9:30 AM.
 * https://www.hackerrank.com/challenges/30-nested-logic
 */
public class NestedLogic {
    public static void main(String args[]) {
        //Create variables
        int[] inputStream = new int[6];
        boolean correct = true;
        int fee = 0;
        //Take data from the command line input
        Scanner in = new Scanner(System.in);
        //Split the data into variables
        for (int i = 0; i < inputStream.length; i++) {
            try {
                inputStream[i] = Integer.parseInt(in.next());
            } catch (Exception e) {
                System.out.println();
                System.out.println("Bad String");
                correct = false;
                break;
            }
        }
        if (correct) {
            //In case year is bigger - return 10 000
            if (inputStream[2] > inputStream[5]) {
                fee = 10000;
            } else if (inputStream[2] == inputStream[5]) {
                if (inputStream[1] > inputStream[4]) {
                    //In case month is bigger - return (ActualMonth - expected month) x 500
                    fee = (inputStream[1] - inputStream[4]) * 500;
                } else if (inputStream[1] == inputStream[4]) {
                    if (inputStream[0] > inputStream[3]) {
                        //In Case date is bigger - return (Actual Date - expected date) x 15
                        fee = (inputStream[0] - inputStream[3]) * 15;
                    }
                }
            }
            //In other cases return 0
        } else {
            fee = -1;
        }
        System.out.println(fee);
    }
}
