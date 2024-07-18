package Tree;

import java.util.TreeSet;

public class Treeset_op {
    public static void main(String[] args) {
        TreeSet<String> tree=new TreeSet<>();
        tree.add("Bob");
        tree.add("Sam");
        tree.add("Anne");
        tree.add("Kathir");

        for(String word:tree){
            System.out.println(word+" ");
        }
    }
    // So any values we put into a treeset should be auto sorted 😃
}
