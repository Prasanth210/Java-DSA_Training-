package Accenture_training;

/*Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.

        Return the positive integer k. If there is no such integer, return -1.



        Example 1:

        Input: nums = [-1,2,-3,3]
        Output: 3
        Explanation: 3 is the only valid k we can find in the array.
        Example 2:

        Input: nums = [-1,10,6,7,-7,1]
        Output: 7
        Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
        Example 3:

        Input: nums = [-10,8,6,7,-2,-3]
        Output: -1
        Explanation: There is no a single valid k, we return -1.


        Constraints:

        1 <= nums.length <= 1000
        -1000 <= nums[i] <= 1000
        nums[i] != 0                        */

import java.util.Arrays;
import java.util.Scanner;
public class Day_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] str=scan.nextLine().split(" ");
        int[] arr=new int[str.length];
        for(int n=0;n<str.length;n++){
            arr[n]=Integer.parseInt(str[n]);
        }

        System.out.println(maxnum(arr));
    }
    static int maxnum(int[] arr){
        Arrays.sort(arr);
        int Max=0;
        for(int n=0;n<arr.length;n++){
            for(int m=arr.length-1;m>=0;m--){
                if(arr[n] == (arr[m]*-1)){
                    Max=arr[m]*-1;
                }
            }
        }
        if(Max == 0) return -1;
        return Max;
    }
}
