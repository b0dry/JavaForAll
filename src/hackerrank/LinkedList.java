package hackerrank;

import java.util.Scanner;

/**
 * Created by DDinkov on 02-Nov-16 4:23 PM.
 * https://www.hackerrank.com/challenges/30-linked-list
 */
class NodeLinkedList {
    int data;
    NodeLinkedList next;

    NodeLinkedList(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {

    public static NodeLinkedList insert(NodeLinkedList head, int data) {
        //Complete this method
        if (head == null)
            return new NodeLinkedList(data);
        else if (head.next == null)
            head.next = new NodeLinkedList(data);
        else
            insert(head.next, data);

        return head;
    }


    public static void display(NodeLinkedList head) {
        NodeLinkedList start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        NodeLinkedList head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}
