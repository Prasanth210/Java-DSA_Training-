package Binary_Search;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Binary_Search_working {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr={9,21,30,34,36,37,40,45,62};
        int tar=scan.nextInt();
//        Bs(arr,tar,0,arr.length-1);
//        Ls(arr,tar,0);
        System.out.println(binarySearch(arr,tar,0,arr.length-1));
    }
    static  void Bs(int[] arr,int tar,int low,int high){
        if(low>high){
            System.out.println("Element not found");
            return;
        }
            int mid = (low + high) / 2;
            if (arr[mid] == tar) {
                System.out.println("Binary Search : "+mid);
                return;
            } else if (tar < arr[mid]) {
                Bs(arr, tar, low, mid - 1);
            } else if (tar > arr[mid]) {
                Bs(arr, tar, mid + 1, high);
            }
    }
    static void Ls(int[] arr,int tar,int i){
            if(tar == arr[i]){
                System.out.println("Linear Search : "+i);
                return;
            }
        if(i == arr.length-1 ){
            System.out.println("Element not found ");
            return;
        }
        Ls(arr, tar, i + 1);

    }
    static int binarySearch(int[] arr,int tar,int low,int high){
        if (low > high) {
            return -1;
        }
        int mid=(low+high)/2;
        if(arr[mid] == tar){
            return mid;
        }

        if(tar<arr[mid]){
            return binarySearch(arr,tar,low,mid-1);
        }
        if(tar>arr[mid]){
            return binarySearch(arr,tar,mid+1,high);
        }
        return -1;
    }
}
