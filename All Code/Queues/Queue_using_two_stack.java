import java.util.*;
public class Queue_using_two_stack {
    static class Queue{
        static Stack <Integer> s1 = new Stack<>();
        static Stack <Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }


        public static void add(int data){
            //transferring elements from s1 to s2
            while(!s1.isEmpty()){
                int temp = s1.pop();
                s2.push(temp);
            }
            //adding new element 
            s1.push(data);
            //transferring the elements back
            while(!s2.isEmpty()){
                int temp = s2.pop();
                s1.push(temp);
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String args[]){
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());

//        while(!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();

//        }
    }
    
}
