package hackerrank;

import java.util.Scanner;

/**
 * Created by dobromirdinkov on 11/11/16.
 * https://www.hackerrank.com/challenges/30-linked-list-deletion
 */

class NodeDay24{
    int data;
    NodeDay24 next;
    NodeDay24(int d){
        data=d;
        next=null;
    }

}
public class MoreLinkedList {
    public static NodeDay24 removeDuplicates(NodeDay24 head) {
        //Write your code here
        if (head == null)
            return null;
        NodeDay24 temp = head;
        while (temp.next != null) {
            if (temp.data == temp.next.data)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        return head;
    }

    public static  NodeDay24 insert(NodeDay24 head,int data)
    {
        NodeDay24 p=new NodeDay24(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            NodeDay24 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(NodeDay24 head)
    {
        NodeDay24 start=head;
        while(start!=null)
        {
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        NodeDay24 head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }

}
