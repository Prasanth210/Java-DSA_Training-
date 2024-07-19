package Codeathon;
class Node {
        public int data;
         Node left, right;
         Node(int data) {
            this.data = data;
            left =null;
            right = null;
        }
    }
public class BT_is_BST_or_not {

        static int maxValue(Node root)
        {
            if (root == null) {
                return Integer.MIN_VALUE;
            }
            int value = root.data;
            int leftMax = maxValue(root.left);
            int rightMax = maxValue(root.right);

            return Math.max(value, Math.max(leftMax, rightMax));
        }

        static int minValue(Node root)
        {
            if (root == null) {
                return Integer.MAX_VALUE;
            }
            int value = root.data;
            int leftMax = minValue(root.left);
            int rightMax = minValue(root.right);

            return Math.min(value, Math.min(leftMax, rightMax));
        }

        static boolean isBST(Node root)
        {
            if (root == null) {
                return true;
            }

            if (root.left != null
                    && maxValue(root.left) > root.data) {
                return false;
            }
            if (root.right != null
                    && minValue(root.right) < root.data) {
                return false;
            }

            if (!isBST(root.left) || !isBST(root.right)) {
                return false;
            }

            return true;
        }

        public static void main(String[] args)
        {
            Node root = new Node(4);
            root.left = new Node(2);
            root.right = new Node(5);
            root.left.left = new Node(1);
            root.left.right = new Node(3);

            System.out.print(isBST(root));

        }
    }

