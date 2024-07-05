package Graph;

public class Number_of_island_dfs {
    public static void main(String[] args) {
//        char[][] ch={{'1','1','0','0','0'},
//                     {'1','1','0','0','0'},
//                     {'0','0','1','0','0'},
//                     {'0','0','0','1','1'}};

        char[][] ch={{'1','0','0','0','0','0','0','1','0'},
                     {'1','1','0','0','0','0','1','0','1'},
                     {'0','0','1','0','0','0','0','1','0'},
                     {'1','0','1','0','0','0','0','0','0'},
                     {'0','1','1','1','0','0','0','0','0'},
                     {'0','0','0','0','0','0','0','1','0'},
                     {'0','0','0','1','1','0','0','0','0'}};

        System.out.println(island(ch));
    }
    static int row=0;
    static int col=0;
    static int island(char[][] grid){
        row=grid.length;
        col=grid[0].length;
        int count=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == '1'){
                    islanddfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    static void islanddfs(char[][] grid,int i,int j){
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j] != '1'){
            return;
        }

        grid[i][j] = '2';

        islanddfs(grid,i,j-1); //left
        islanddfs(grid,i-1,j); //up
        islanddfs(grid,i,j+1); //right
        islanddfs(grid,i+1,j); //down
//        islanddfs(grid,i+1,j+1); //rightDown diagonal
//        islanddfs(grid,i+1,j-1); //leftDown diagonal
//        islanddfs(grid,i-1,j-1); //leftRight diagonal
//        islanddfs(grid,i-1,j+1); //rightup diagonal
    }
}
