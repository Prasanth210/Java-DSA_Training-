package Graph;

public class Number_of_Enclaves {
    public static void main(String[] args) {
        int [][] grid={{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(numEnclaves(grid));
    }

        static int row=0;
        static int col=0;
        public static int numEnclaves(int[][] grid) {
            row=grid.length;
            col=grid[0].length;

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(grid[i][j] == 1 && Atlast(i,j)){
                        check(grid,i,j);
                    }
                }
            }
            int enclaves = 0;
            for (int i=0;i<row;i++){
                for (int j=0;j<grid[i].length;j++){
                    if (grid[i][j] == 1){
                        enclaves++;
                    }
                }
            }

            return enclaves;
        }
        public static void check(int[][] grid,int i,int j){
            if(i<0 || j<0 || i>=row || j>= col){
                return;
            }
            if(grid[i][j] == 0){
                return;
            }

            grid[i][j] = 0;

            check(grid, i, j - 1);   // left
            check(grid, i, j + 1);   // right
            check(grid, i - 1, j);   // up
            check(grid, i + 1, j);   // down

        }
        static boolean Atlast(int i,int j){
            return i==0 || j==0 || i==row-1 || j==col-1;
        }
    }

