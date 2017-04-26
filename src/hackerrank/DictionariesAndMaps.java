package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by DDinkov on 27-Oct-16 11:04 AM.
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps
 */
public class DictionariesAndMaps {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (!phoneBook.containsKey(s))
                System.out.println("Not found");
            else
                System.out.printf("%s=%d%n", s, phoneBook.get(s));
        }
        in.close();
    }
}
