package Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PreOrder_Traversal {

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data+" ");

    }
    public static void Inorder(Node root){
        if(root == null) {
            return;
        }
        preorder(root.left);
        System.out.print(root.data+" ");
        preorder(root.right);

    }

    public static void levelorder(Node root,ArrayList<ArrayList<Integer>>ar){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

      while(!queue.isEmpty()){
          int levelSize = queue.size();
          ArrayList<Integer> alist = new ArrayList<>();

          for (int i = 0; i < levelSize; i++) {

              Node n1 = queue.poll();
              alist.add(n1.data);

              if (n1.left != null) {
                  queue.add(n1.left);
              }
              if (n1.right != null) {
                  queue.add(n1.right);
              }
          }

         ar.add(alist);

     }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>ar=new ArrayList<>();
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.print("Pre order   : ");
      //  preorder(root);
        System.out.print("\nPost Order  : ");
     //   postorder(root);
        System.out.print("\nIn order    : ");
    //    Inorder(root);
        System.out.print("\nLevel order : ");
        levelorder(root,ar);
        System.out.println(ar);

    }
}
