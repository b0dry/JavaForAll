package hackerrank;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by DDinkov on 27-Apr-17 2:56 PM.
 * https://www.hackerrank.com/challenges/java-bigdecimal
 */
public class bigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        //Write your code here
        for(int i = 0; i < n; i++){
            for(int j = n - 1; j >= 1; j--){
                BigDecimal bigger = new BigDecimal(s[j]);
                BigDecimal smaller = new BigDecimal(s[j-1]);
                if(smaller.compareTo(bigger) < 0){
                    String tmp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = tmp;
                }
            }
        }


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }


}
