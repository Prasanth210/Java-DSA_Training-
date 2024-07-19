package Codeathon;
import java.util.*;
public class Merge_k_sorted_arrays {
    static void Merge(int[][] arr,int N,int K,int[] ans){
        int c=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<K;j++){
                ans[c]=arr[i][j];
                c++;
            }
        }
        Arrays.sort(ans);
    }
    public static void main(String[] args) {
        int[][] arr = { { 2, 6, 12, 34 },{ 1, 9, 20, 1000 },{ 23, 34, 90, 2000 } };
        int K = 4;
        int N = 3;
        int[] ans=new int[N*K];
         Merge(arr,N,K,ans);

         for(int each:ans){
             System.out.print(each+" ");
         }
    }


}
