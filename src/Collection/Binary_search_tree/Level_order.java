package Collection.Binary_search_tree;

import java.util.LinkedList;
import java.util.Queue;

public class Level_order {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        lev_order(root);
    }
    static void lev_order(Node root){
        Queue <Node> qu=new LinkedList<>();

    }
}
