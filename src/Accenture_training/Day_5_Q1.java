package Accenture_training;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day_5_Q1 {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//            Scanner scan=new Scanner(System.in);
//            int size=scan.nextInt();
//            int[] arr=new int[size];
//            for(int n=0;n<size;n++){
//                arr[n]=scan.nextInt();
//            }
            int arr[]={3,4,5,6,7,8,9};
            StringBuilder sc=new StringBuilder();
            for(int each:arr){
                sc.append(each);
            }
            Arrays.sort(arr);
            StringBuilder acc=new StringBuilder();
            for(int each:arr){
                acc.append(each);
            }
            StringBuilder rev=new StringBuilder(acc.reverse());

            if(sc.toString().equals(acc.toString()) || sc.toString().equals(rev.toString())){
                System.out.print("Monotonic");
            }
            else{
                System.out.print("Not Monotonic");
            }
        }
}
