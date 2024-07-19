public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        workArray(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void workArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        workArray(arr, start + 1, end - 1);
    }
}