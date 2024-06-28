package Collection;
// This is a Program to print First unique characer

import java.util.LinkedList;
import java.util.Queue;

public class unique_char {
    public static void main(String[] args) {
      String st="aabcdaab";
        uniquechar(st);
    }
    static void uniquechar(String str){
        int arr[]=new int[26];
        Queue<Character> qu=new LinkedList<>();
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           qu.add(ch);
           arr[ch - 'a']++;
        }
        while (!qu.isEmpty() && arr[qu.peek()-'a']>1){
            qu.remove();
        }
        if(qu.isEmpty()){
            System.out.print("-1");
        }
        else{
            System.out.println(qu.peek()+" ");
        }
    }
}
