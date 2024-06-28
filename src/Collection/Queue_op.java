package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Queue_op {
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String args[]) {
        for (int i = 1; i < 10; i++) {
            q.add(i);
        }
     //   reverseq();
        reverse_recursion(q);
        print();
    }

    static void reverseq() {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.peek());
            q.remove();
        }
        while (!st.isEmpty()) {
            q.add(st.peek());
            st.pop();

            while (!q.isEmpty()) {
                System.out.print(q.peek() + " ");
                q.remove();
            }
        }
    }

    static void reverse_recursion(Queue<Integer> q) {
        if (q.size() == 0) {
            return;
        }
        int fr = q.peek();

        q.remove();
        reverse_recursion(q);
        q.add(fr);

    }
    static void print(){
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
