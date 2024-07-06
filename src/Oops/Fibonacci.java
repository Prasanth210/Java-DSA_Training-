package Oops;

import java.util.HashMap;

public class Fibonacci {
    static  HashMap<Integer,Long> memo=new HashMap<Integer, Long>();
    public static void main(String[] args) {
        System.out.println(fibonacci_num(80));
    }
    static long fibonacci_num(int num){
        if(num == 0 || num ==1){
            return num;
        }
        if(memo.containsKey(num)){
            return memo.get(num);
        }

        Long fibval=fibonacci_num(num-1)+fibonacci_num(num-2);
        memo.put(num,fibval);
        return fibval;
    }
}
