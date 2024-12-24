package Sorting_re;

public class Shell_sorting {
    public static void main(String[] args) {
        Swap ob=new Swap();
        int arr[]={5,6,7,2,4,235,8,4,1};
        int size=arr.length;
        for(int n=size/2;n>=1;n=n/2){
            for(int p=n;p<size;p++){
                for(int n2=p-n;n2>=0;n2=n2-n){
                    if(arr[n2+n]>arr[n2]){
                        break;
                    }
                    ob.swap(arr,n2+n,n2);
                }
            }
        }
        for(int n=0;n<arr.length;n++){
            System.out.print(arr[n]+" ");
        }
    }
}
