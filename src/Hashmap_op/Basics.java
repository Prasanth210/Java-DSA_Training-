package Hashmap_op;
import java.util.*;
import java.util.HashMap;

public class Basics {
    // It, include creating,add,remove,Accesing etc..
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ar[]={1,5,6,9,1,5,6};

        for(int num:ar){
            map.put(num,map.getOrDefault(num,0)+1 );
        }
        Set<Map.Entry<Integer,Integer>> es =map.entrySet();
        for(Map.Entry<Integer,Integer> val : es){
            if(val.getValue() == 1){
                System.out.println(val.getKey());
                break;
            }
        }

//        for(int i=1,j=10;i<11 && j<110 ;i++,j=j+10){
//            map.put(i,j);
//        }
//        System.out.println(map.get(2));
//        map.remove(3);
//        System.out.println(map.containsKey(4)+" "+map.containsValue(100));
//        System.out.println(map.size()+" ");
//        for(int key:map.values()){
//            System.out.println(key);
//        }

//        Set<Map.Entry<Integer,Integer>> entryset = map.entrySet();
//        for(Map.Entry<Integer,Integer> val : entryset){
//            System.out.println(val.getKey()+" "+val.getValue());
//        }
       // System.out.println(map);
    }
}
