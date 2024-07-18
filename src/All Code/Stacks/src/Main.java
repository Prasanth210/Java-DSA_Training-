import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main{
    public class StackCreation_arrayList{
        static ArrayList<Integer> list = new ArrayList<>();

        //1) is empty function
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //2) push  -- function for adding element in the top
        public static void push(int data){
            list.add(data);
        }

        //3) pop  --  this functions deletes the data from the top
        public static int pop(){
            //if list is empty
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //4) peek -- to see or get the top value
        public static int peek(){
            //if the list is empty
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);

        }

    }



}