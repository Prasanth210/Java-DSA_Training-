package Stacks;
import java.util.Stack;

    public class ReverseWords {

        public static String reverseWords(String s) {
            if (s == null || s.length() == 0) {
                return s;
            }

            Stack<Character> stack = new Stack<>();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != ' ') {
                    stack.push(c);
                } else {
                    while (!stack.isEmpty()) {
                        result.append(stack.pop());
                    }
                    result.append(c); // Append the space
                }
            }

            // Append the remaining characters in the stack
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String input = "Hello World";
            String reversed = reverseWords(input);
            System.out.println("Original string: " + input);
            System.out.println("Reversed string: " + reversed);
        }
    }

