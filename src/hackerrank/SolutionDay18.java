package hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by DDinkov on 04-Nov-16 11:33 AM.
 * https://www.hackerrank.com/challenges/30-queues-stacks
 */
class SolutionDay18 {
    Stack<Character> s = new Stack<>();
    private Queue<Character> q = new LinkedList<>();


    void pushCharacter(char c) {
        s.push(c);
    }

    char popCharacter() {
        return s.pop();
    }

    void enqueueCharacter(char c) {
        q.add(c);
    }

    char dequeueCharacter() {
        return q.remove();
    }
}

