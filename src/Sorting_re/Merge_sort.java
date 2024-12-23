package Sorting_re;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr={50,45,8,1,99,2561,5,4,545};

        mergesort(arr,0,arr.length-1);

        for(int n=0;n<arr.length;n++){
            System.out.print(arr[n]+" ");
        }
    }
    static void mergesort(int[] arr,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);

            merge(arr,l,mid,r);
        }
    }
    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;

        int larr[]=new int[n1];
        int rarr[]=new int[n2];

        for(int n=0;n<n1;n++){
            larr[n]=arr[l+n];
        }
        for(int n=0;n<n2;n++){
            rarr[n]=arr[mid+1+n ];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(larr[i]<=rarr[j]){
                arr[k]=larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=larr[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
}
