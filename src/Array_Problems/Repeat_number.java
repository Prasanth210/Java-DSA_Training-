package Array_Problems;

import java.util.ArrayList;

public class Repeat_number {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        fun(arr);
    }
    static void fun(int[] arr){
        if(arr.length % 2 != 0){
            // Edge case
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int n=0;n<arr.length;n=n+2){
            int num=arr[n];
            int val=arr[n+1];
            for(int p=0;p<num;p++){
                list.add(val);
            }
        }
        System.out.println(list);
    }
}
