package hackerrank;

import static hackerrank.SolutionDay21.printArray;

/**
 * Created by DDinkov on 07-Nov-16 4:59 PM.
 * https://www.hackerrank.com/challenges/30-generics
 */
public class Generics {
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        printArray( intArray  );
        printArray( stringArray );

        if(SolutionDay21.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }




}
