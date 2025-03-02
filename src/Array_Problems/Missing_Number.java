package Array_Problems;

public class Missing_Number {
    public static void main(String[] args) {
        int arr[]={1, 2, 4, 5};
        System.out.println(missing(arr));
    }
    static int missing(int arr[]){
        int num=0;
        for(int n=1;n<arr.length;n++){
            if(arr[n] != arr[n-1]-1){
                num = arr[n]+1;
                break;
            }
        }
        return num;
    }
}
