package Problems;

public class Min_swaps_toGroup {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,1,0,0};
        System.out.println(cal(arr));
    }
        public static int cal(int[] nums) {
            int k=0;
            for(int each:nums){
                k+=each;
            }
            int sum=0; int min=nums.length;
            for(int j=0;j<nums.length;j++){
                sum+=nums[j];
                if(j>=k){sum-=nums[j-k];}
                if(j>=k-1)min=Math.min(min,k-sum);
            }
            for(int i=0;i<=k-2;i++){
                //length-k,...,length-1
                //length-k+1 - 0; length-k+2 - 1; length-k+3 - 2;
                sum=sum+nums[i]-nums[nums.length-k+i];
                min=Math.min(min,k-sum);
            }
            return min;
        }
    }
