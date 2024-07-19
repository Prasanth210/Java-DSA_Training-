import java.util.*;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        modifyStack(stack);
        System.out.println(stack.peek());
    }

    public static void modifyStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int x = stack.pop();
            modifyStack(stack);
            stack.push(x + 5);
        }
    }
}