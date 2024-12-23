package Restart;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap_damp {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        int nums[]={0,0,0,1,1,0,1,0};

       // Map<Integer,Integer> map=new HashMap<>();
        int maxLength = 0;
        int count = 0;
        HashMap<Integer,Integer> countMap=new HashMap<>();
        countMap.put(0, -1);
        for (int i = 0; i < nums.length;i++) {
            count+=nums[i]==1?1:-1;
            if (countMap.containsKey(count)) {
            //    System.out.print(countMap.get(count)+" ");
                maxLength = Math.max(maxLength,i-countMap.get(count));
            }
            else {
                countMap.put(count,i);
            }
        }
        System.out.println(maxLength);
    }
}
