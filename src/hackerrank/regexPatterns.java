package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Consider a database table, Emails, which has the attributes First Name and Email ID.
 * Given  rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in .
 */
public class regexPatterns {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".*@gmail\\.com");
        Scanner in = new Scanner(System.in);
        List<String> l = new ArrayList<>();
        int N = in.nextInt();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = p.matcher(emailID);
            if (m.find())
                //System.out.println(firstName);
                l.add(firstName);
        }
        Collections.sort(l);
        for(String tmp : l){
            System.out.println(tmp);
        }
    }
}
