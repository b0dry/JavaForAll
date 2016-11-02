package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 02-Nov-16 4:23 PM.
 * https://www.hackerrank.com/challenges/30-linked-list
 */
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {

    public static Node insert(Node head, int data) {
        //Complete this method
        return head;
    }


    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
