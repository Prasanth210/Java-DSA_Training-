package Collection;

// InputL: 1  3  0  2  4  0
// Output: 3  4  2  4 -1 -1

import java.util.Arrays;
import java.util.Stack;
public class Stack_nextmax {

public static void main(String[] args){
     Stack<Integer> st=new Stack<>();
     int[] arr={6,8,0,1,3,9};
     st.push(-1);
     int[] arr2=new int[arr.length];
     arr2[arr2.length-1]=-1;
     for(int i=arr.length-1;i>=1;i--){
         if(arr[i-1]<arr[i]){
             st.push(arr[i]);
             arr2[i-1]=arr[i];
         }
         else{
             st.push(-1);
             arr2[i-1]=-1;
         }
     }
    System.out.println(Arrays.toString(arr2));

    }
}
