package Array_Problems;

import java.util.Arrays;

public class Move_Zeros {
    public static void main(String[] args) {
        int[] arr={0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(move(arr)));
    }
    static int[] move(int[] arr){
        int idx=0;
        for(int num : arr){
            if(num != 0){
                arr[idx++] = num;
            }
        }
        while(idx < arr.length){
            arr[idx++] = 0;
        }
        return arr;
    }
}
