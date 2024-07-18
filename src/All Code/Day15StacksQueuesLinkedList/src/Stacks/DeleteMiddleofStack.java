package Stacks;
import java.util.Stack;
public class DeleteMiddleofStack {
    static Stack<Integer> stack = new Stack<>();

        public static void deleteMiddle(int sizeofstack, int current) {
            // Base case: If current is half of the stack size, pop the middle element
            if (current == sizeofstack / 2) {
                stack.pop();
                return;
            }

            // Remove the current top element
            int topElement = stack.pop();

            // Recursive call
            deleteMiddle(sizeofstack, current+1);

            // Push the element back to the stack
            stack.push(topElement);
        }

        public static void main(String[] args) {

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            System.out.println("Original Stack: " + stack);
            int sizeofstack = stack.size();
            deleteMiddle(sizeofstack, 0);
            System.out.println("Stack after deleting middle element: " + stack);
        }
    }
