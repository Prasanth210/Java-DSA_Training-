package Collection;

public class Starting_Ending_position_of_target {
    public static void main(String[] args) {
        Starting_Ending_position_of_target pos = new Starting_Ending_position_of_target();
        int[] arr={5,7,7,8,8,10};
        int tar=9;
        int start= pos.start_positon(arr,tar);
        int eend= pos.end_positon(arr,tar);
        System.out.println(start+" "+eend);
    }
    int start_positon(int[] arr,int tar){
       for(int i=0;i<arr.length;i++){
           if(arr[i] == tar){
               return i;
           }
       }
       return -1;

    }
    int end_positon(int[] arr,int tar){
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i] == tar){
                return i;
            }
        }
        return -1;
    }
}
