package Graph;
import java.util.*;
//___________________________________Using DFS________________________________________________________________
public class Flood_Fill {
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sc = 1, sr = 1, color = 2;
        floodFill(grid, sr, sc, color);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] grid, int sr, int sc, int color) {
        if (grid[sr][sc] != color) {
            flood_fill_dfs(grid, sr, sc, grid[sr][sc], color);
        }
        return grid;
    }

    public static void flood_fill_dfs(int[][] grid, int row, int col, int in, int color) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != in) {
            return;
        }
        grid[row][col] = color;
        flood_fill_dfs(grid, row + 1, col, in, color);    //down
        flood_fill_dfs(grid, row - 1, col, in, color);    //up
        flood_fill_dfs(grid, row, col + 1, in, color);    //right
        flood_fill_dfs(grid, row, col - 1, in, color);    //left

    }

   // _______________________________Using BFS___________________________________________________________


        public static class Pair {
            int row;
            int col;

            Pair(int r, int c) {
                this.row = r;
                this.col = c;
            }
        }

        public static int[][] floodfill(int[][] grid, int sr, int sc, int color) {
            int n = grid.length;
            int m = grid[0].length;

            int drow[] = {-1, 0, 1, 0};
            int dcol[] = {0, 1, 0, -1};
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(sr, sc));
            while (!q.isEmpty()) {
                int r = q.peek().row;
                int c = q.peek().col;
                q.remove();
                for (int i = 0; i < 4; i++) {
                    int nrow = r + drow[i];
                    int ncol = c + dcol[i];
                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == sc) {
                        q.add(new Pair(nrow, ncol));
                        grid[nrow][ncol] = color;
                    }
                }
            }
            return grid;

        }

        public static void Main(String args[]) {
            int[][] grid = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
            int n = grid.length;
            int m = grid[0].length;

            int[][] res = floodfill(grid, 1, 0, 2);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }

        }
    }


