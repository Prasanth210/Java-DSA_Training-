package Stacks;
import java.util.Stack;

public class EvaluateRevPolishNotation {
        public static int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            for (String token : tokens) {
                if (token.equals("+") ||
                        token.equals("-") ||
                        token.equals("*") ||
                        token.equals("/")) {

                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    int newNum = 0;

                    switch (token) {
                        case "+":
                            newNum = num2 + num1;
                            break;
                        case "-":
                            newNum = num2 - num1;
                            break;
                        case "*":
                            newNum = num2 * num1;
                            break;
                        case "/":
                            newNum = num2 / num1;
                            break;
                    }
                    stack.push(newNum);
                } else {
                    stack.push(Integer.parseInt(token));
                }
            }
            return stack.peek();
        }

        public static void main(String[] args) {
            String[] tokens = {"2", "1", "+", "3", "*"};
            System.out.println(evalRPN(tokens));
        }
    }