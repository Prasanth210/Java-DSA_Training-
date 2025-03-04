package Array_Problems;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        rot(arr,10);
    }

    // brute force

   /*  static void rot(int[] arr,int k){
        if(k>=arr.length){
            k %= arr.length;
        }
        for(int n=0;n<k;n++){
            int val = arr[arr.length-1];
            for(int p=arr.length-1;p>0;p--){
                arr[p]=arr[p-1];
                if(p==1){
                    arr[0] = val;
                }
            }
        }
        for(int v:arr){
            System.out.print(v+" ");
        }
    }

    */

    // optimized

    static void rot(int [] arr, int k){
        if(k>=arr.length){
            k %= arr.length;
        }

        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

        for(int val:arr){
            System.out.print(val+" ");
        }

    }
    static void reverse(int[] arr ,int l,int r){
        while(l<r){
            int temp =arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
