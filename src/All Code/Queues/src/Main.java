import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= 4; i++) {
            stack.push(i);
        }

        System.out.println(stack.pop());
        stack.push(stack.pop() + stack.peek());
        stack.push(stack.pop() - 1);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(7);
        System.out.println(stack.pop());
    }
}
