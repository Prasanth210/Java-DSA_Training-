package Problems;
import java.util.*;
public class Daily_Temperatures {
    public static void main(String[] args) {
       int[]  temperatures = {73,74,75,71,69,72,76,73};
       int[] ans = dailyTemperatures(temperatures);
       for(int val:ans){
           System.out.print(val+" ");
       }
    }
        public static int[] dailyTemperatures(int[] temperatures) {
            Stack<Integer> stack = new Stack<>();
            int[] result = new int[temperatures.length];

            for (int i = 0; i < temperatures.length; i++) {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int idx = stack.pop();
                    result[idx] = i - idx;
                }
                stack.push(i);
            }

            return result;

    }
}
