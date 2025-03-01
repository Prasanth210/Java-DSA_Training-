package Problems;
import java.util.*;

public class Leet2460 {
    public static void main(String[] args) {
        int[] ar={1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperations(ar)));
    }

    public static int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
                i++;
            }
        }
        return shift(nums);
    }
    static int[] shift(int [] arr){
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
