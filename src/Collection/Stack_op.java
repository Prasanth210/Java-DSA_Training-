package Collection;
import java.util.Stack;
public class Stack_op {
    static Stack<Integer> st=new Stack<>();
    public static void deleteMid(int sizeofstack,int current){
        if(current == sizeofstack/2){
            st.pop();
            return;
        }
        int topelement =st.pop();
        deleteMid(sizeofstack,current+1);
        st.push(topelement);
    }
    public static void main(String[] args){
        for(int i=1;i<6;i++){
            st.push(i);
        }
        System.out.println("Original Stack: "+st);
        int sizeofstack =st.size();

        deleteMid(sizeofstack,0);
        System.out.println("After deleting Mid: "+st);
    }
}
