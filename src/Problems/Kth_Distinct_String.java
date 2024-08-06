package Problems;
import java.util.*;
public class Kth_Distinct_String {
        public static String kthDistinct(String[] arr, int k) {
            HashMap<String,Integer>ar=new HashMap<>();
            for(int n=0;n<arr.length;n++){
                if(ar.containsKey(arr[n])){
                    ar.put(arr[n],ar.get(arr[n])+1);
                }
                else {
                    ar.put(arr[n],1);
                }
            }
            ArrayList<String> li=new ArrayList<>();
            for(Map.Entry<String,Integer> en : ar.entrySet()){
                if(en.getValue() == 1){
                    li.add(en.getKey());
                }
            }
            Collections.reverse(li);
            if(li.size() < k){
                return "";
            }
            else{
                return li.get(k-1);
            }
        }

    public static void main(String[] args) {
        String [] arr = {"d","b","c","b","c","a"};
        int k = 2;
        System.out.println(kthDistinct(arr,k));
    }
}