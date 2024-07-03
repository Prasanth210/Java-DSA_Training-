package Collection;

import java.util.*;
        public class Ransome_note {

            public static boolean canConstruct(String ransomeNote,String magazine){
                HashMap<Character,Integer> map = new HashMap<>();
                for(int i = 0 ; i < magazine.length(); i++){
                    char ch = magazine.charAt(i);
                    if(map.containsKey(ch)){
                        map.put(ch,map.get(ch) + 1);
                    }
                    else{
                        map.put(ch,1);
                    }
                }
                for(int i = 0 ; i < ransomeNote.length(); i++){
                    char ch = ransomeNote.charAt(i);
                    if(map.containsKey(ch)){
                        map.put(ch,map.get(ch) - 1);
                        int value = map.get(ch);
                        if(value == -1)
                            return false;
                    }
                    else
                        return false;
                }
                return true;
            }

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String s1 = input.nextLine();
                String s2 = input.nextLine();
                System.out.println(canConstruct(s1,s2));
            }
        }
        

