package Collection;

public class Count_tree_nodes {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.left=new Node(8);
        root.left.left.right=new Node(9);
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(11);
        root.right.left.left=new Node(12);
        root.right.left.right=new Node(13);
        root.right.right.left=new Node(14);
        root.right.right.right=new Node(15);

        System.out.print(Count(root));
      //  System.out.println("  "+co);
    }

     // static int co=0;
    static int num=0;
    static int  Count(Node nd) {
    if(nd ==null){
        return 0;
    }
    //  co +=1;
    return 1+ Count(nd.left)+Count(nd.right); //recursion to count the nodes
    }

    static int height(Node nd){
        if(nd==null){
            return 0;
        }
        return  0;
    }

}
