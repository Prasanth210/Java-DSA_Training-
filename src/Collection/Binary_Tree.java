package Collection;

public class Binary_Tree {
//    public static class Node{
//        int data;
//        Node left;
//        Node Right;
//
//        public Node (int data){
//            this.data=data;
//            this.left=null;
//            this.Right=null;
//        }
//    }
     static class BinaryTree{
        static int idx=-1;
        public static Node build_tree(int [] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=build_tree(nodes);
            newNode.right=build_tree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.build_tree(nodes);
        System.out.println(root.left.right.data);
    }
}
