package Collection;
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
public class Dequeue_op {
    static  Deque<Integer> d = new LinkedList<>();
public  static void main(String args[]) {
   d.addFirst(10);
   d.addLast(20);
   d.addFirst(30);
   d.addLast(40);
   d.addFirst(50);
   d.addLast(60);

    System.out.print("\nOriginal "+d);
    d.removeLast();
    System.out.print("\nRemove last "+d);
    d.removeFirst();
    System.out.println("\nRemove First "+d);
  }

}
