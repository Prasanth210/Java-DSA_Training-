package Sorting_re;

public class Insertion_sort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};

        for(int n=1;n<arr.length;n++){
            int key=arr[n];
            int p=n-1;

            while(p>=0 && arr[p]>key){
                arr[p+1]=arr[p];
                p--;
            }
            arr[p+1]=key;
        }
        for(int n=0;n<arr.length;n++){
            System.out.print(arr[n]+" ");
        }

    }
}
