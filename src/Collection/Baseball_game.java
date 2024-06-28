package Collection;

import java.util.Stack;

public class Baseball_game {
    public static void main(String[] args) {

        String[] str ={"5", "2", "C", "D", "+"};
      baseballop(str);

    }
    static void baseballop(String[] str){
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<str.length;i++) {
            if (str[i].equals("+")){
                int num=st.pop();
                int newnum=num+st.peek();
                st.push(num);
                st.push(newnum);
            } else if (str[i].equals("C")) {
                st.pop();
            } else if (str[i].equals("D")) {
                st.push(st.peek()*2);
            }
            else{
                st.push(Integer.parseInt(str[i]));
            }
        }
        int sum = 0;
        for (int score : st) {
            sum += score;
        }
        System.out.println(st);
        System.out.println(sum);
    }
}
