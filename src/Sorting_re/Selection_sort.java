package Sorting_re;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={9,4,2,7,8,1,7,8};
        for(int n=0;n<arr.length-1;n++){
            int min=n;

            for(int p=n+1;p<arr.length;p++){
                if(arr[p]<arr[min]){
                        min=p;
                }
            }

            int val=arr[min];
            arr[min]=arr[n];
            arr[n]=val;

        }
        for(int n=0;n<arr.length;n++){
            System.out.print(arr[n]+" ");
        }
    }
}
