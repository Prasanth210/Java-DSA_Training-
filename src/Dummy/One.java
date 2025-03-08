package Dummy;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int size= scan.nextInt();
        int val=3;
        for(int n=1;n<=size;n++){
            System.out.print(n*n+" "+ val +" ");
            val*=3;
        }

    }
}

//
//459 500
//549