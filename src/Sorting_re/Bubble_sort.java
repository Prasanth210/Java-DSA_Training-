package Sorting_re;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};

        for(int n=0;n<arr.length-1;n++){
            for(int p=0;p<arr.length-n-1;p++){
                if(arr[p]>arr[p+1]){
                    int temp=arr[p];
                    arr[p]=arr[p+1];
                    arr[p+1]=temp;
                }
            }
        }
        for(int n=0;n<arr.length;n++){
            System.out.print(arr[n]+" ");
        }
    }
}
