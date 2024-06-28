package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Zigzag_Traversal {
    public static List<List<Integer>> Zigzag(Node root){
        boolean left_to_right=true;
        List<List<Integer>> ans=new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            List<Integer> level=new ArrayList<>();

            for(int i=0;i<size;i++){
                Node node =qu.poll();

            if(left_to_right){
                level.add(node.data);
            }
            else{
                level.add(0, node.data);
            }
            if(node.left!=null){
                qu.offer(node.left);
            }
            if(node.right!=null) {
                qu.offer(node.right);
            }
            }
            ans.add(level);
            left_to_right =! left_to_right;
         }
        return ans;
    }
    static int count=0;
    public static void printresult(List<List<Integer>> result){
        for(List<Integer> row:result){
            for(int val:row){
                System.out.print(val+" ");
            }
            count=count+1;
            System.out.println();
        }
        System.out.println("Height of the tree is : "+count);
    }

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
        List<List<Integer>> result=Zigzag(root);
        printresult(result);

    }
}
