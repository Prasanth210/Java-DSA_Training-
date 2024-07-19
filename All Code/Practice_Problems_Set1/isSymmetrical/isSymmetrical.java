package isSymmetrical;

// Node structure for the binary tree
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize the node with a value
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class isSymmetrical {

    public static boolean isSym(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return (left.data == right.data)
                && isSym(left.left, right.right)
                && isSym(left.right, right.left);
    }

    public static boolean isSymmetrical(Node root) {
        if (root == null) {
            return true;
        }
        return isSym(root.left, root.right);
    }

    public static void main(String[] args) {
        // Create a symmetric tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        if (isSymmetrical(root)) {
            System.out.println("The binary tree is symmetrical.");
        } else {
            System.out.println("The binary tree is not symmetrical.");
        }
    }
}
