package Accenture_training;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="racecar";
        String str2="carruce";

        System.out.println(fun(str1,str2));
    }
    static boolean fun(String s1,String s2){
        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();

        char[]ch1=s1.toCharArray();
        char[]ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
}
