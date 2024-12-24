package Sorting_re;

public class Swap {
    public int[] swap(int[] arr,int l,int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        return arr;
    }
}
