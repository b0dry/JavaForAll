package hackerrank;

/**
 * Created by DDinkov on 28-Oct-16 1:05 PM.
 * https://www.hackerrank.com/challenges/30-abstract-classes
 */

abstract class Book {
    String title;
    String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    abstract void display();


}
