package Binary_Search;

public class Search_in_Rotation {
    public static void main(String[] args) {
        int[] arr={1,3};
        System.out.println(bs(arr,3,0,arr.length-1));
    }
    static int bs(int[] arr,int tar,int left,int right){
        boolean br=false;
        while(left<=right){
            int mid=(left + right)/2;
            if(arr[mid]==tar){
                return mid;
            }
            if(!br) {
                if (tar > arr[mid]) {
                    right = mid - 1;
                } else if (tar < arr[mid]) {
                    left = mid + 1;
                }
                br=true;
            }
            else{
                if (tar < arr[mid]) {
                    right = mid - 1;
                } else if (tar > arr[mid]) {
                    left = mid + 1;
                }
            }

        }
        return -1;
    }
}
