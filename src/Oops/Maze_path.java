package Oops;

import java.util.HashMap;
import java.util.Scanner;
public class Maze_path {
    public static void main(String[] args){
        int n=2,r=0,c=0;
        String ans="";
        maze(n,r,c,ans);
    //    maze2(n,r,c,0);
    }
    public static void maze(int n, int r, int c, String ans){
        if(n==r && n==c){

            System.out.println(ans);
            return;
        }
        if(r>n || c>n){
            return;
        }
        maze(n,r,c+1,ans+"H");
        maze(n,r+1,c,ans+"V");

    }

//    static  HashMap<Integer,Integer> memo=new HashMap<>();
//    public static void maze2(int n, int r, int c, int ans1){
//        if(n==r && n==c){
//            System.out.println(ans1);
//            return;
//        }
//        if(r>n || c>n){
//            return;
//        }
//        maze(n,r,c+1, ans1+1);
//        maze(n,r+1,c,ans1+1);
//
//    }
}
