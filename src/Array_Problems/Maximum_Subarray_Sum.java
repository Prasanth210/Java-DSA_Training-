package Array_Problems;

public class Maximum_Subarray_Sum {
    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(max(arr));
    }
    static int max(int arr[]){
        int max=0;
        for(int n=0;n<arr.length;n++){
            int sum=0;
            for(int p=n;p<arr.length;p++){
                sum += arr[p];
                if(sum>max){
                    max=sum;
                }
            }
        }
        return max;
    }
}
