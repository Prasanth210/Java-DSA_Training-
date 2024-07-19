package DeepestLeavesSum;

import java.util.*;

 class Node {
    int data;
    Node left;
    Node right;

     Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class DeepestLeavesSum {
    public static int deepestLeavesSum(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            sum = 0; // Reset the sum at each level
            for (int i = 0; i < size; i++) {
                Node currentNode = queue.poll();
                sum += currentNode.data;
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }

        return sum; // Sum of the deepest leaves
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.right.right = new Node(6);
        root.left.left.left = new Node(7);
        root.right.right.right = new Node(8);

        int ans = deepestLeavesSum(root);
        System.out.println(ans);

    }
}
