package hackerrank;

import java.util.Calendar;

/**
 * Created by dobromirdinkov on 10/15/16.
 * https://www.hackerrank.com/challenges/java-date-and-time
 * The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
 * <p>
 * You are given a date. Your task is to find what the day is on that date.
 * <p>
 * Input Format
 * <p>
 * A single line of input containing the space separated month, day and year, respectively, in   format.
 * <p>
 * Constraints
 * <p>
 * <p>
 * Output Format
 * <p>
 * Output the correct day in capital letters.
 * <p>
 * Sample Input
 * <p>
 * 08 05 2015
 * Sample Output
 * <p>
 * WEDNESDAY
 * Explanation
 * <p>
 * The day on August th  was WEDNESDAY.
 */
public class JavaDateAndTime {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String month = in.next();
//        String day = in.next();
//        String year = in.next();
        String month = "8";
        String day = "5";
        String year = "2015";
//
        Calendar date = Calendar.getInstance();
        //System.out.println(date.getFirstDayOfWeek());
        //date.setFirstDayOfWeek(date.getFirstDayOfWeek());
        date.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));

        switch (date.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
        }

        //in.close();
    }
}