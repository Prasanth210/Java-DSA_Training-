package Tree;

import java.util.TreeMap;
import java.util.TreeSet;

public class Treeset_op {
    public static void main(String[] args) {
        TreeSet<String> tree=new TreeSet<>();
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(5,"nine");
        map.put(4,"roy");
        map.put(1,"manisha");
        map.put(9,"laura");

        tree.add("Bob");
        tree.add("Sam");
        tree.add("Anne");
        tree.add("Kathir");

        for(String word:tree){
            System.out.println(word+" ");
        }
        System.out.println(map);
        
    }
    // So any values we put into a treeset should be auto sorted 😃
}
