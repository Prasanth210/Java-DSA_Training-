package Problems;

import java.util.*;

// 3[a]2[bc]
// 3[a2[c]]

public class Decode_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str="3[a]2[bc]";
       // String str=scan.nextLine();
        System.out.println(decodeString(str));
    }
        static public String decodeString(String s) {
            Stack<Integer> countStack = new Stack<>();
            Stack<String> stringStack = new Stack<>();
            StringBuilder currentString = new StringBuilder();
            int number = 0;

            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    number = number * 10 + (c - '0'); // To handle multi-digit numbers
                } else if (c == '[') {
                    countStack.push(number);
                    stringStack.push(currentString.toString());
                    number = 0;
                    currentString = new StringBuilder();
                } else if (c == ']') {
                    StringBuilder decodedString = new StringBuilder(stringStack.pop());
                    int repeatCount = countStack.pop();
                    decodedString.append(currentString.toString().repeat(repeatCount) );
                    currentString = decodedString;
                } else {
                    currentString.append(c);
                }
            }
            return currentString.toString();
        }
}
