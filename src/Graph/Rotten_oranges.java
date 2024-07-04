package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Rotten_oranges {
    public static class Pair{
        int row;
        int col;
        int time;

        Pair(int row,int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }


    public static void main(String[] args) {
        int [][] grid={{2,1,1},{1,1,0},{0,1,1}};
        int ans=rotten(grid);
        System.out.println("The time taken is : "+ans);
    }
    static int rotten(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        Queue <Pair> qu=new LinkedList<>();
        int[][] vis=new int[n][m];
        int countfresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    qu.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                if(grid[i][j] == 1){
                    countfresh++;
                }

            }
        }
        int time=0;
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        int count=0;

        while(!qu.isEmpty()) {
            int r = qu.peek().row;
            int c = qu.peek().col;
            int t = qu.peek().time;

            time = Math.max(time, t);
            qu.remove();

            for (int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                    qu.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    count++;

                }
            }
        }

        if(count != countfresh){
            return -1;
        }
        return time;
    }
}
