package Array_Problems;
public class Second_Largest {
    public static void main(String[] args) {
        int[] arr={10, 5, 20, 8, 40 ,50 };
        System.out.println(check(arr));
    }
    static int check(int [] arr){
        int first=arr[0];
        int second = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
        }
        return second;
    }
}
