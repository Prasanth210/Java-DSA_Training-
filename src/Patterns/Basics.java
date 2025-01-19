package Patterns;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//        int num=scan.nextInt();
//        for(int n=num;n>=0;n--){
//            for(int p=0;p<=n;p++){
//                System.out.print(p+" ");
//            }
//            System.out.println();
//        }
        int n=7;
        int sum=0;
        for(int p=1;p<=n;p++){
            if(p%3 == 0 ){
                sum+=3;
            }
            else if(p%5 == 0){
                sum+=5;
            }
            else if(p%7 == 0){
                sum+=7;
            }
        }
        System.out.println(sum);
    }
}
