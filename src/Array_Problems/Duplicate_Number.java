package Array_Problems;

import java.util.HashSet;

public class Duplicate_Number {
    public static void main(String[] args) {
        int arr[]={1, 3, 4, 2, 2};
        System.out.println(duplicate(arr));
    }
    static int duplicate(int [] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int n=0;n<arr.length;n++){
            if(!set.contains(arr[n])){
                set.add(arr[n]);
            }
            else{
                return arr[n];
            }
        }
        return 0;
    }
}
