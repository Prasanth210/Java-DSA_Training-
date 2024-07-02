package Sorting_Algorithm;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={10,60,50,30,20};
        boolean swap;
        for(int i=0;i<arr.length-1;i++){
            swap=false;
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                     swap=true;
                }
            }
            if(swap==false){
                break;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
