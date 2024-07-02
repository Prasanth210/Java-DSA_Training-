package Collection.Binary_search_tree;

public class Depth_node {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data=val;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
     Node root=new Node(1);
     root.left=new Node(3);
     root.right=new Node(2);
     root.left.left=new Node(5);    
    }
}
