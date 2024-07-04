package Oops;

import java.util.HashMap;
import java.util.Stack;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "tac";
        String word2 = "cat";

     //   System.out.println(valid_Anagram(word1, word2));
        //  System.out.println(valid_AnagramDs(word1,word2));
        System.out.println(valid_anagram_hashmap(word1, word2));
    }

    static int count;

    static boolean valid_Anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    count++;
                }
            }
        }
        if (count == s.length()) {
            return true;
        } else
            return false;
    }

    static boolean valid_AnagramDs(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == st.peek()) {
                st.pop();
            }
        }
        return !st.isEmpty();
    }

    static boolean valid_anagram_hashmap(String w1, String w2) {
        if (w1.length() != w2.length()) {
            return false;
        }
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < w1.length(); i++) {
            char ch = w1.charAt(i);
            if (hash.containsKey(ch)) {
                hash.put(ch, hash.get(ch) + 1);
            } else {
                hash.put(ch, 1);
            }
        }
        System.out.println(hash);
        for (int i = 0; i < w2.length(); i++) {
            char ch = w2.charAt(i);
            if (hash.containsKey(ch)) {
                int key=hash.get(ch);
                hash.put(ch, key-1);
            }
        }
        System.out.println(hash);
        for(int val:hash.values()){
            if(val !=0) {
                return false;
            }
        }
        return true;
    }
}
