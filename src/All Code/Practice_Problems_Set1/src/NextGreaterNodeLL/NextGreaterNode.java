package NextGreaterNodeLL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterNode {
    public static int[] nextLargerNodes(Node head) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> nums = new ArrayList<>();

        Node temp = head;

        // Convert linked list to an array
        while (temp != null) {
            nums.add(temp.data);
            temp = temp.next;
        }

        int[] res = new int[nums.size()];

        // Traverse the array from right to left
        for (int i = nums.size() - 1; i >= 0; i--) {
            // Maintain the stack to only have elements greater than nums[i]
            while (!stack.isEmpty() && stack.peek() <= nums.get(i)) {
                stack.pop();
            }

            // If stack is not empty, the top element is the next greater element
            if (!stack.isEmpty()) {
                res[i] = stack.peek();
            } else {
                res[i] = 0; // No greater element
            }

            // Push the current element onto the stack
            stack.push(nums.get(i));
        }

        return res;
    }


    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(7);
        head.next.next = new Node(4);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(5);

        int[] ans = nextLargerNodes(head);
        System.out.println(Arrays.toString(ans));

    }

}
