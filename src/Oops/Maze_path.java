package Oops;

public class Maze_path {
    public static void main(String[] args){
        int n=2,r=0,c=0;
        String ans="";
        maze(n,r,c,ans);
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
}
