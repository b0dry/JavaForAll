/**
 * Created by DDinkov on 10-Nov-16 2:49 PM.
 * https://www.hackerrank.com/challenges/30-binary-trees
 */
package hackerrank;

import java.util.*;
import java.util.LinkedList;

class NodeDay23 {
    NodeDay23 left, right;
    int data;

    NodeDay23(int data) {
        this.data = data;
        left = right = null;
    }
}

class BSTLevelOrderTraversal {
    static void levelOrder(NodeDay23 bst) {
        //Write your code here
        Queue<NodeDay23> q = new LinkedList();
        q.add(bst);

        while (!q.isEmpty()) {
            NodeDay23 n = q.remove();
            System.out.print(n.data + " ");
            if (n.left!=null) q.add(n.left);
            if (n.right!=null) q.add(n.right);
        }
    }

    public static NodeDay23 insert(NodeDay23 root, int data) {
        if (root == null) {
            return new NodeDay23(data);
        } else {
            NodeDay23 cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        NodeDay23 root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}