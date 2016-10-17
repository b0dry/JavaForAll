package hackerrank;

import javax.swing.text.StringContent;
import java.io.*;
import java.util.*;

/**
 * Created by DDinkov on 17-Oct-16 4:36 PM.
 * https://www.hackerrank.com/challenges/java-anagrams
 * Two strings  and  are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of  is .
 * <p>
 * Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not. The strings may consist at most  English characters; the comparison should NOT be case sensitive.
 * <p>
 * This exercise will verify that you can sort the characters of a string, or compare frequencies of characters.
 * <p>
 * Sample Input 0
 * <p>
 * anagram
 * margana
 * Sample Output 0
 * <p>
 * Anagrams
 * Sample Input 1
 * <p>
 * anagramm
 * marganaa
 * Sample Output 1:
 * <p>
 * Not Anagrams
 */
public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        boolean answer = isAnagram(a, b);
        System.out.println((answer) ? "Anagram" : "Not Anagram");

    }

    static boolean isAnagram(String a, String b) {
        String aSorted = "";
        boolean result = false;
        // Complete the function by writing your code here.
        if (a.equalsIgnoreCase(b))
            return true;
        return false;
    }
}
