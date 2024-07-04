package Oops;

import java.util.ArrayList;

public class HappyNumber {
    public static void main(String[] args) {
        int num=13;
        int result=happy(num);

        if(result == 1){
            System.out.println("Happy number");
        }
        else {
            System.out.println("unhappy number");
        }
    }
    static ArrayList<Integer>list1=new ArrayList<>();
    static int happy(int num){
        int result=0;
        while (num > 0) {
            int mod=num%10;
            result+=mod*mod;
            num/=10;
        }

        if(result == 1){
            return result;
        }
        if(!list1.isEmpty()) {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) == result) {
                    return -1;
                }
            }
        }
        list1.add(result);
        return happy(result);

    }
}
