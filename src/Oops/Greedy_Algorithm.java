package Oops;

import java.util.ArrayList;

public class Greedy_Algorithm {
    public static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};

        maxop(start,end,0);
    }
    static int count=1;
    static void maxop(int[] start,int[] end,int en){
        int lastend=end[0];
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=0;i<end.length;i++){
            if(start[i]>lastend){
                count++;
                list.add(i);
                lastend=end[i];
            }
        }
        System.out.println("Max operations: "+count);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
