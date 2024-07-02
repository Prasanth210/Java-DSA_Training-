package Sorting_Algorithm;
// it works by point the minimum element in a array and swap it to a first index and so on
public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {10, 60, 50, 30, 20};
      //  bylower(arr);
        byupper(arr);

    }
    static void bylower(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[idx]) {
                    idx = j;
                }
                int temp=arr[idx];
                arr[idx]=arr[i];
                arr[i]=temp;
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    static void byupper(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx=i;
            for(int j=i+1;j<arr.length;j++) {
                if (arr[j] > arr[idx]) {
                    idx = j;
                }
            }
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
