package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_K_elements {
   static Queue<Integer> qu = new LinkedList<>();
    public static void main(String[] args) {

        for (int i = 1; i < 7; i++) {
            qu.add(i);
        }
        int k=3;
        reversek(k);
    }
    static void reversek(int k){

        if(qu.isEmpty()) {
            return;
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.push(qu.peek());
            qu.remove();
        }
        while (!st.isEmpty()){
            qu.add(st.peek());
            st.pop();
        }
        for(int i=0;i<k;i++){
            qu.add(qu.peek());
           qu.remove();
        }
        while(!qu.isEmpty()){
            System.out.print(qu.peek()+" ");
            qu.remove();
        }
    }
}
