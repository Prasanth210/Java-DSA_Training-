import java.util.*;
public class valid_anagram {
    public static boolean anagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap <Character, Integer> map = new HashMap<>();

        for(int i =0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        for(int i =0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }else{
                return false;
            }
        }

        return map.isEmpty();
    }
    public static void main(String args[]){
        String s1 = "anagram", s2 = "nagaram";
        System.out.println(anagram(s1,s2));

    }
}
