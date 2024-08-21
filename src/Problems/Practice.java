package Problems;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        String str="11101111011111";
        String[] arr=str.split("0");
        ArrayList<Character>ar=new ArrayList<>();
        for(int n=0;n<arr.length;n++){
            int num=arr[n].length()+64;
            char ch=(char)num;
            ar.add(ch);
        }
        for(char each:ar){
            System.out.print(each);
        }

    }
}
