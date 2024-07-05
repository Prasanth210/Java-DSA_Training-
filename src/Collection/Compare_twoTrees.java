package Collection;

import java.awt.*;

public class Compare_twoTrees {
public Node root;

public Compare_twoTrees(){
    root=null;
}
    public static void main(String[] args) {
        Compare_twoTrees obj1=new Compare_twoTrees();
        obj1.root=new Node(1);
        obj1.root.left=new Node(2);
        obj1.root.right=new Node(3);
        obj1.root.left.left=new Node(4);
        obj1.root.left.right=new Node(5);
        obj1.root.right.left=new Node(6);
        obj1.root.right.right=new Node(7);

        Compare_twoTrees obj2=new Compare_twoTrees();
        obj2.root=new Node(1);
        obj2.root.left=new Node(2);
        obj2.root.right=new Node(3);
        obj2.root.left.left=new Node(4);
        obj2.root.left.right=new Node(5);
        obj2.root.right.left=new Node(6);
        obj2.root.right.right=new Node(7);

        System.out.println(compare(obj1.root,obj2.root));

    }
    static boolean compare(Node p,Node q){
    if(p == null && q == null){
        return true;
    }
    if(p != null && q != null){
        return ((p.data == q.data) && (compare(p.left,q.left)) && (compare(p.right,q.right)));
    }
    return false;
    }
}
