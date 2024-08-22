package Accenture_training;

import java.util.Scanner;
import java.util.Stack;

public class Day_4_Q1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();

        Stack<Character> st=new Stack<>();
        StringBuilder input = new StringBuilder();
        for(int n=0;n<str.length();n++){
            if(str.charAt(n) == '*'){
            /*   if(!st.isEmpty()) */st.pop();
              /* else {
                   System.out.println("String not be converted");
                   break;
               } */
            }
            else{
                st.push(str.charAt(n));
            }
        }

        for(int n=0;n<str.length();n++){
            if(!st.isEmpty()){
                input.append(st.pop());
            }
        }
        System.out.println(input.reverse());
    }
}
